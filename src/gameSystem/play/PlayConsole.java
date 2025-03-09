package gameSystem.play;

import java.util.Random;
import java.util.Scanner;

import gameSystem.event.Event;
import gameSystem.event.EventDTO;
import gameSystem.event.EventManager;
import gameSystem.play.data.InventoryDTO;
import gameSystem.play.data.PlayerInfoDTO;
import menuSystem.ASCIIArt;

public class PlayConsole {

	private Random rd = new Random();
	private Scanner sc = new Scanner(System.in);
	private PlayView pv = new PlayView();
	private PlayDAO playDao = new PlayDAO();
	private PlayerInfoDTO stat = PlayerInfoDTO.getInstance();
	private EventDTO evdto = EventDTO.getInstance();
	private EventManager evm = EventManager.getInstance();
	private InventoryDTO inven = InventoryDTO.getInstance();
	private ASCIIArt asc = new ASCIIArt();

	Event ev;

	public void loop() {

		boolean wholeLoopBoolean = true;
		while (wholeLoopBoolean) { // 전체 루프

			
			// 현재 진행상황 확인
			ev = evm.getCurrentEvent();

			boolean b = true;
			while (b) { // 동일 이벤트 루프

				// 콘솔창 정리
				clearConsole();
				
				// 이벤트 내용 출력
				ev.viewText();

				// 현재 상태 출력
				pv.showStatus();

				// 선택지 출력
				ev.viewChoice(); // 1, 2, 3 출력
				ev.viewChoiceConfig(); // 0 출력
				
				// 선택 입력받기
				int choiceInput = pv.getInput();
				
				// 0 입력 시 환경설정으로
				wholeLoopBoolean = showConfig(choiceInput);
				
				// wholeLoopBoolean에 false 적용 시 실행 X
				// (환경설정에서 게임메뉴 선택 시)
				if(wholeLoopBoolean) {
					
					// 선택지 결과 적용
					b = choiceResult(choiceInput);
					// 1~3 입력시 b에 false 반환
					// -> 동일 이벤트 루프 탈출 (b == false)
					// -> 다음 이벤트 진행
					
					// 결과창 확인 용 입력 -> 엔터 입력 시 콘솔창 정리
					System.out.println();
					System.out.println("계속 진행하려면 엔터를 눌러주세요");
					sc.nextLine();
					
				} else {
					// wholeLoopBoolean에 false 적용 시
					// 동일 이벤트 루프 탈출(break 이용)
					// -> 이어서 전체 루프 탈출(wholeLoopBoolean == false)
					break; 
				}
			} // 동일 이벤트 루프 end

			// 게임메뉴 선택 시 실행X
			if(wholeLoopBoolean) {
				// 난수 발생 -> 이벤트 선택
				ev = getRandomEvent();
			}
			
			// 현재 데이터 저장 (추가필요)
			playDao.updateSaveData();
			
			if(wholeLoopBoolean) {
				// HP 확인
				if (checkHpZero()) {
					break; // hp가 0이면 전체 루프 탈출
				}
				// Mental 확인
				if (checkMentalZero()) {
					break; // mental이 0이면 전체 루프 탈출
				}
				// 엔딩 확인
				if (checkReachEnding()) {
					break; // ending이 1이면 전체 루프 탈출
				}
				
			}
			
		}
	}

	public Event getRandomEvent() {
		int eventTypeRd = rd.nextInt(10); //난수 발생
		
		if (eventTypeRd < 4) { // storyEvent 40%
			
			// 현재 스토리이벤트의 인덱스 받기
			evdto.setCurrentEventIndex(evdto.getCurrentStoryProgress1()+101);
			// 인덱스를 통해 이벤트 클래스 호출
			ev = evm.getEvents().get(evdto.getCurrentEventIndex());
			// 현재 스토리이벤트 +1
			evdto.continueStory1();
			// 현재 진행이벤트 변수에 저장
			evm.setCurrentEvent(evdto.getCurrentEventIndex());
			return ev;
			
		} else { // normalEvent 60%
			
			// 전체 noramlEvent 중 인덱스 랜덤 추출하여 저장
			evdto.setCurrentEventIndex(rd.nextInt(evdto.NORMAL_EVENT_INDEX) + 201);
			// 인덱스를 통해 이벤트 클래스 호출
			ev = evm.getEvents().get(evdto.getCurrentEventIndex());
			// 현재 진행이벤트 변수에 저장
			evm.setCurrentEvent(evdto.getCurrentEventIndex());
			return ev;
		}
	}
	
	public void clearConsole() {
		for(int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}
	
	public boolean checkHpZero() {
		if (stat.getHp() == 0 && inven.getItem1()==0) {
			clearConsole();
			asc.ASC_exhausted();
			System.out.println("더이상 힘에 부쳐 나아가기 힘들다...\n이제 그만 두는게 맞는 것 같다.");
			asc.ASC_gameover();
			evm.setCurrentEvent(001); // start event reset
			evdto.setCurrentStoryProgress1(0);
			evdto.setCurrentEventIndex(001);
			stat.resetStatus(); // status reset
			inputBuffer();
			return true;
			
			// 붕대 사용
		} else if (stat.getHp()==0 && inven.getItem1()==1) {
			inven.setItem1(0);
			stat.setHp(1);
			System.out.println("품에 있던 붕대를 사용해서 급한 상처를 치료했다.");
			inputBuffer();
			return false;
		}
		return false;
	}
	
	public boolean checkMentalZero() {
		if (stat.getMental() == 0) {
			clearConsole();
			asc.ASC_frustration();
			System.out.println("더이상 내 주변 상황들을 견디기 벅차다...\n이제 그만 두는게 맞는 것 같다.");
			asc.ASC_gameover();
			resetAll();
			inputBuffer();
			return true;
		}
		return false;
	}

	public boolean checkReachEnding() {
		if (stat.getEnding() == 1) {
			clearConsole();
			asc.ASC_ending();
			System.out.println("축하합니다! 엔딩에 도달했습니다!");
			stat.plusPlayCnt();
			resetAll();
			inputBuffer();
			return true;
		}
		return false;
	}


	public boolean choiceResult(int choiceInput) {
		boolean b = true;
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			if (choiceInput == 1) {
				ev.result1(); // 1번 선택지 결과 적용
				b = false;
				break;
			} else if (choiceInput == 2) {
				ev.result2(); // 2번 선택지 결과 적용
				b = false;
				break;
			} else if (choiceInput == 3) {
				ev.result3(); // 3번 선택지 결과 적용
				b = false;
				break;
			} else {
//				choiceInput = getInput(); // 다시 선택
				break;
			}
		}
		return b;
		
		// 다음 신으로 진행
	}

	public boolean showConfig(int choiceInput) {
		if (choiceInput == 0) {
			while (true) {
				int configInput = pv.viewConfigMenu();
				if (configInput == 1) { // 1. 돌아가기
					return true;
				} else if (configInput == 2) { // 2. 인벤토리
					pv.viewInventoryStore(); // 인벤토리 뷰 호출
				} else if (configInput == 3) { // 3. 게임메뉴
					return false;
				}
			}
		}
		return true;
	}
	
	public void resetAll() {
		evdto.setCurrentStoryProgress1(0); // storyProgress reset
		evdto.setCurrentEventIndex(001); // currentEvent rest
		evm.setCurrentEvent(001); // start event reset
		stat.resetStatus(); // status reset
		inven.resetInventory(); // inventory reset
	}
	
	public void inputBuffer() {
		// 결과창 확인 용 입력 -> 엔터 입력 시 콘솔창 정리
		System.out.println();
		System.out.println("게임메뉴로 돌아가려면 엔터를 눌러주세요");
		sc.nextLine();
	}
	

}
