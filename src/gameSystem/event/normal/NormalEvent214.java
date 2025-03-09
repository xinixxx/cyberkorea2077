package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent214 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("오랜만에 정부에서 아무런 지령이 내려오지 않았다.\n"
	            + "이런 날은 드물고, 어딘가 어색하게 느껴졌다.\n"
	            + "\n"
	            + "주변은 조용했고,\n"
	            + "나에게 주어진 시간은 오롯이 나의 것이었다.\n"
	            + "하지만 이 시간을 어떻게 보내야 할까?\n"
	            + "\n"
	            + "운동을 하며 몸을 단련할까?\n"
	            + "아니면 책을 읽으며 마음의 여유를 찾을까?\n"
	            + "\n"
	            + "맛있는 음식을 먹으며 잠시나마 행복을 느껴볼 수도 있다.\n"
	            + "나는 잠시 고민했다.\n"
	            + "이 평온함 속에 숨어 있는 불안을 떨쳐낼 수 있을까?");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 운동을 한다");
	    System.out.println("[2] : 책을 읽는다");
	    System.out.println("[3] : 맛있는 음식을 먹는다");
	}

	@Override
	public void result1() {
	    System.out.println("운동을 하다 다리를 다쳐버렸다...\n(체력 -1)");
	    stat.minusHp();
	}

	@Override
	public void result2() {
	    System.out.println("읽고싶던 책이 생각보다 너무 재미가 없었다.\n(멘탈 -1)");
	    stat.minusMental();
	}

	@Override
	public void result3() {
		if(stat.getMoney()>0) {
			System.out.println("맛있는 음식에는 돈을 아낄 수 없지!!\n(돈 -1)");
			stat.minusMoney();
		} else {
			System.out.println("맛있는 음식을 먹고 싶지만, 나에겐 가진 돈이 없다...\n(멘탈 -1)");
			stat.minusMental();
		}
	}

}
