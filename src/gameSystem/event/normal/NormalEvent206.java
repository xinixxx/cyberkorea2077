package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent206 extends Event {

	@Override
	public void viewText() {
		System.out.println("저 멀리 잡상인이 보였다.\n"
	            + "그는 여러 물건을 팔고 있었고, 손님을 기다리는 듯했다.\n"
	            + "\n"
	            + "잡상인의 물건들은 하나같이 독특해 보였다.\n"
	            + "빨간 풍선은 눈길을 끌었고, 쿠키는 맛있어 보였다.\n"
	            + "\n"
	            + "하지만 이 물건들이 정말 믿을 수 있는 것들일까?\n"
	            + "나는 잠시 고민했다. 무엇을 사야 할까?");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 부풀어 오른 빨간 풍선을 구매한다. (돈 -1)");
	    System.out.println("[2] : 맛있어 보이는 쿠키를 구매한다. (돈 -1)");
	    System.out.println("[3] : 아무것도 사지 않고 돌아간다.");
	}

	@Override
	public void result1() {
		if(stat.getMoney() > 0) {
			System.out.println("빨간 풍선을 구매했더니, 안에 이상한 가스가 들어 있었다!"
					+ "\n뭔가...기분이 좋아ㅈ..ㅣㄴ...다...\n(멘탈 +1, 체력 -1)");
			stat.minusMoney();
			stat.plusMental();
			stat.minusHp();
		} else {
			System.out.println("주머니를 뒤졌지만, 동전 한 푼 없었다.");
		}
	}

	@Override
	public void result2() {
		if(stat.getMoney() > 0) {
			System.out.println("쿠키를 먹었더니 배가 든든해졌다!\n(체력 +1)");
			stat.minusMoney();
			stat.plusHp();
		} else {
			System.out.println("주머니를 뒤졌지만, 동전 한 푼 없었다.");
		}
	}

	@Override
	public void result3() {
	    System.out.println("아무것도 사지 않고 돌아갔다. 아무 일도 일어나지 않았다.");
	}

}
