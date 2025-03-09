package menuSystem;

import gameSystem.event.EventDTO;
import gameSystem.event.EventManager;
import gameSystem.play.PlayConsole;
import gameSystem.play.PlayDAO;
import gameSystem.play.data.InventoryDTO;
import gameSystem.play.data.PlayerInfoDTO;
import menuSystem.main.MainDAO;
import menuSystem.main.MainView;
import menuSystem.member.MemberInfoDAO;
import menuSystem.member.MemberInfoDTO;
import menuSystem.member.MemberView;

public class MenuConsole {

	private MemberView memberView = new MemberView();
	private MemberInfoDAO memberDao = new MemberInfoDAO();
	private MemberInfoDTO memberDto = new MemberInfoDTO();

	private MainView mainView = new MainView();
	private MainDAO mainDao = new MainDAO();
	private PlayConsole pc = new PlayConsole();
	private PlayDAO playDao = new PlayDAO();
	private EventManager evm = EventManager.getInstance();
	private EventDTO evdto = EventDTO.getInstance();
	private PlayerInfoDTO stat = PlayerInfoDTO.getInstance();
	private InventoryDTO inven = InventoryDTO.getInstance();
	
	private ASCIIArt asc = new ASCIIArt();

	public void loginMenu() {

		while (true) {
			
			clearConsole();
			asc.ASC_main();
			
			// 로그인 메뉴 출력
			int input = memberView.loginMenuView(); 

			// 1 : 회원가입
			if (input == 1) {
				memberDto = memberView.joinView(); // ID, PW, NAME 입력
				if(memberDao.join(memberDto) == -1) { // ID 중복확인
					mainView.inputBuffer();
				} else {
					playDao.makeDefaultSaveData(memberDto); // 기본 정보 DB에 저장
					mainView.inputBuffer();
				}

			// 2 : 로그인
			} else if (input == 2) {
				memberDto = memberView.loginView(); // ID, PW 입력
				if (memberDao.login(memberDto)) { // 로그인 및 완료 확인
					stat.setId(memberDto.getId()); // 싱글톤 인스턴스에 ID 저장
					mainView.inputBuffer();
					mainMenu();
				} else {
					System.out.println("- - -  로그인 실패 - - - ");
					mainView.inputBuffer();
				}

			// 3. 종료
			} else {
				break;
			}
		}
	}

	public void mainMenu() {
		
		while (true) {
			
			clearConsole();
			asc.ASC_main();
			
			// 메인 메뉴 출력
			int input = mainView.mainMenuView();

			// 1 : 게임플레이
			if (input == 1) {
				playDao.getSaveData(); // DB에서 세이브데이터 획득
				gameMenu(); // 게임메뉴로 진행

			// 2 : 데이터 초기화
			} else if (input == 2) {
				// 초기화 여부 재확인
				if(mainView.resetView()) { 
					// DB 초기화 진행 및 실행여부 확인
					if (playDao.resetSaveData()) {
						System.out.println("세이브 데이터가 초기화되었습니다.");
						mainView.inputBuffer();
					} else {
						System.out.println("- - - 초기화 실패 - - -");
						mainView.inputBuffer();
					}
				} else {
					System.out.println("- - - 초기화 취소 - - -");
					mainView.inputBuffer();
				}

			// 3. 회원탈퇴
			} else if (input == 3) {
				// 회원탈퇴 여부 재확인
				if(mainView.deleteView()) {
					// 회원탈퇴 진행 및 실행여부 확인
					if(mainDao.delete(memberDto)) {
						System.out.println("- - - 회원탈퇴 성공 - - -");
						mainView.inputBuffer();
					} else {
						System.out.println("- - - 회원탈퇴 실패 - - -");
						mainView.inputBuffer();
					}
				} else {
					System.out.println("- - - 회원탈퇴 취소 - - -");
					mainView.inputBuffer();
				}
				// 4. 뒤로가기
			} else {
				break;
			}
		}
	}

	public void gameMenu() {
		
		while (true) {
			
			clearConsole();
			asc.ASC_main();
			
			// 게임 메뉴 출력
			int input = mainView.gameMenuView();

			// 1 : 새게임
			if (input == 1) {
				evm.setCurrentEvent(001); // 현재 이벤트를 intro(001)로 설정
				stat.resetStatus(); // status reset
				inven.resetInventory(); // inventory reset
				evdto.setCurrentStoryProgress1(0); // 싱글톤 인스턴스 진행도를 001로 설정
				evdto.setCurrentEventIndex(001); // 싱글톤 인스턴스 현재 이벤트를 001로 설정
				pc.loop(); // 메인 게임루프 진입

			// 2 : 이어하기
			} else if (input == 2) {
				// 현재 이벤트를, 싱글톤 인스턴스 내 index로 설정
				evm.setCurrentEvent(evdto.getCurrentEventIndex());
				pc.loop(); // 메인 게임루프 진입

			// 3 : 플레이 정보 보기
			} else if (input == 3) {
				mainView.viewPlayData();
				mainView.inputBuffer();
				
			// 4. 뒤로가기
			} else {
				break;
			}
		}
	}
	
	public void clearConsole() {
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}

}
