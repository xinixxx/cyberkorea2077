package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent213 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("오랜만에 안전한 위치를 찾은 것 같다.\n"
	            + "주변은 조용하고,\n"
	            + "잠시 숨을 고를 수 있었다.\n"
	            + "\n"
	            + "하지만 이곳이 정말 안전할까?\n"
	            + "숨어 있는 누군가가 있을지도 모른다.\n"
	            + "\n"
	            + "나는 잠시 고민했다.\n"
	            + "지금은 쉬어야 할 때일까?\n"
	            + "아니면 경계를 늦추지 말아야 할까?\n"
	            + "\n"
	            + "몸은 지쳤지만,\n"
	            + "위험을 감수할 수는 없다.\n"
	            + "이곳에서 내가 무엇을 해야 할지 결정해야 한다.\n"
	            + "\n"
	            + "때로는 가장 평온한 순간이\n"
	            + "가장 큰 위험을 숨기고 있다.");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 한숨 잔다");
	    System.out.println("[2] : 잠시 간단하게 휴식만 취한다");
	    System.out.println("[3] : 혹시나 경계해보자");
	}

	@Override
	public void result1() {
	    System.out.println("숨어있던 괴한한테 칼을 맞아 중상을 입었다\n(체력 -1)");
	    stat.minusHp();
	}

	@Override
	public void result2() {
	    System.out.println("충분히 쉬어서 체력을 회복했다\n(체력 +1)");
	    stat.plusHp();
	}

	@Override
	public void result3() {
	    System.out.println("숨어있던 괴한을 찾아 사살해 아이템을 얻었다\n(붕대 +1)");
	    inven.setItem1(1);
	}
}
