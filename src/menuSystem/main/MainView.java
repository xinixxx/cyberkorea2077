package menuSystem.main;

import java.util.Scanner;

import gameSystem.play.data.PlayerInfoDTO;

public class MainView {
	
	private Scanner sc = new Scanner(System.in);
	private PlayerInfoDTO pinfo = PlayerInfoDTO.getInstance();

	public int mainMenuView() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=============== 메인 메뉴 ===============");
		System.out.println();
		System.out.println("[1]게임플레이 [2]초기화 [3]회원탈퇴 [4]뒤로가기");
		System.out.println();
		System.out.print(">> ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	public boolean resetView() {
		boolean b = false;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("세이브 데이터를 초기화 하시겠습니까?");
		System.out.println("Y/N");
		System.out.println();
		System.out.print(">> ");
		String ansDelete = sc.next();
		sc.nextLine();
		
		if (ansDelete.equals("Y")) {
			b = true;
		}
		return b;
	}
	
	public boolean deleteView() {
		boolean b = false;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("회원을 탈퇴하시겠습니까?");
		System.out.println("Y/N");
		System.out.println();
		System.out.print(">> ");
		String ansDelete = sc.next();
		sc.nextLine();
		
		if (ansDelete.equals("Y")) {
			b = true;
		}
		return b;
	}
	
	public int gameMenuView() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=============== 게임 메뉴 ===============");
		System.out.println();
		System.out.println("[1]새게임 [2]이어하기 [3]플레이정보확인 [4]뒤로가기");
		System.out.println();
		System.out.print(">> ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	public void viewPlayData() {
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("엔딩 달성 횟수 : " + pinfo.getPlaycnt());
		System.out.println();
		System.out.println("<< 달성 업적 >>");
		System.out.println(pinfo.getAchievement1()==1?"1. Story1 엔딩 도달":"1. ???");
		System.out.println(pinfo.getAchievement2()==1?"2. Story1 히든 엔딩 도달":"2. ???");
		System.out.println();
		System.out.println("--------------------------------------");

	}
	
	public void inputBuffer() {
		// 결과창 확인 용 입력 -> 엔터 입력 시 콘솔창 정리
		System.out.println();
		System.out.println("진행하시려면 엔터를 눌러주세요");
		sc.nextLine();
	}
	
}
