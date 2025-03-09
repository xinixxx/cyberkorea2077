package gameSystem.play;

import java.util.Scanner;

import gameSystem.play.data.InventoryDTO;
import gameSystem.play.data.PlayerInfoDTO;

public class PlayView {

	private PlayerInfoDTO stat = PlayerInfoDTO.getInstance();
	private InventoryDTO inven = InventoryDTO.getInstance();
	private Scanner sc = new Scanner(System.in);

	public int getInput() {
		System.out.println();
		System.out.print("선택지를 골라주세요 >> ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public int viewConfigMenu() {
		int input = 0;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=============== 환경 설정 ===============");
		System.out.println();
		System.out.println("[1]게임으로 돌아가기  [2]인벤토리  [3]게임메뉴");
		System.out.println();
		System.out.print(">> ");
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public void viewInventoryStore() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("아이템 : ");
		if (inven.getItem1() == 1) System.out.print("붕대 ");
		if (inven.getItem2() == 1) System.out.print("열쇠 ");
		if (inven.getItem3() == 1) System.out.print("권총 ");
		System.out.println();
		System.out.print("능력 : ");
		if (inven.getGadget1() == 1) System.out.print("근력 ");
		if (inven.getGadget2() == 1) System.out.print(" ");
		if (inven.getGadget3() == 1) System.out.print(" ");
		System.out.println();
		System.out.println("--------------------------------------");

	}

	public void showStatus() {
		int currentHp = stat.getHp();
		int currentMoney = stat.getMoney();
		int currentMental = stat.getMental();
		System.out.println("--------------------------------------");
		System.out.print("체력 : ");
		for (int i = 0; i < currentHp; i++) {
			System.out.print("■ ");
		}
		for (int i = 0; i < 3 - currentHp; i++) {
			System.out.print("□ ");
		}
		System.out.print("  멘탈 : ");
		for (int i = 0; i < currentMental; i++) {
			System.out.print("■ ");
		}
		for (int i = 0; i < 3 - currentMental; i++) {
			System.out.print("□ ");
		}
		System.out.print("  돈 : ");
		for (int i = 0; i < currentMoney; i++) {
			System.out.print("■ ");
		}
		for (int i = 0; i < 3 - currentMoney; i++) {
			System.out.print("□ ");
		}
		System.out.println();
		System.out.println("--------------------------------------");

	}
	
	public void inputBuffer() {
		// 결과창 확인 용 입력 -> 엔터 입력 시 콘솔창 정리
		System.out.println();
		System.out.println("게임메뉴로 돌아가려면 엔터를 눌러주세요");
		sc.nextLine();
	}

}
