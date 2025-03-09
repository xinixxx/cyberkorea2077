package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent220 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		   System.out.println("어두운 골목길을 지나던 중, 마약 상인을 발견했다...\n"
		            + "그는 낡은 옷을 입고 주변을 경계하며 무언가를 팔고 있었다.\n"
		            + "\n"
		            + "가까이 다가가자,\n"
		            + "그의 손에는 작은 물건들이 놓여 있었다.\n"
		            + "설탕이 묻은 핫도그부터 주사기까지, 종류는 다양했다.\n"
		            + "\n"
		            + "그의 눈빛은 날카롭고,\n"
		            + "거래를 서두르는 듯했다.\n"
		            + "나는 잠시 고민했다.\n"
		            + "이 물건들 중 무엇을 선택해야 할까?");
		}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 설탕묻은 맛있는 핫도그를 구매한다! (돈 -1)");
		System.out.println("[2] : 스테로이드를 구매한다 (돈 -2)");
		System.out.println("[3] : 주사기를 구매한다 (돈 -1)");
	}

	@Override
	public void result1() {
		if(stat.getMoney()>0) {
			System.out.println("핫도그에 묻은 설탕 덕에 힘이 솟아난다."
					+ "\n배가 든든해졌다.\n(체력 +1)");
			stat.plusHp();
			stat.minusMoney();
		} else {
			System.out.println("주머니를 뒤져봤지만 땡전 한 푼 나오지 않았다..");
		}
	}

	@Override
	public void result2() {
		if(stat.getMoney()>0) {
			System.out.println("스테로이드를 구매하여 근력이 늘었다!\n(근력 획득)");
			inven.setGadget1(1);
			stat.minusMoney();
			stat.minusMoney();
		} else {
			System.out.println("주머니를 뒤져봤지만 땡전 한 푼 나오지 않았다..");
		}
	}

	@Override
	public void result3() {
		if(stat.getMoney()>0) {
			System.out.println("주사기를 구매했지만 딱히 쓸모는 없는 것 같다.");
			stat.minusMoney();
		} else {
			System.out.println("주머니를 뒤져봤지만 땡전 한 푼 나오지 않았다..");
		}
	}

}
