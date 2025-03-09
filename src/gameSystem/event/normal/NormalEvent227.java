package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent227 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("어두운 골목에서 나는 목표물을 추적하고 있었다.\n"
	            + "그는 중요한 정보를 가진 인물로, 반드시 붙잡아야 했다.\n"
	            + "\n"
	            + "그의 움직임은 빠르고, 주변을 경계하는 모습이 역력했다.\n"
	            + "나는 그의 뒤를 따라가며 적절한 순간을 기다렸다.\n"
	            + "\n"
	            + "갑자기 그는 골목 끝에서 멈춰 섰다.\n"
	            + "주변을 살피더니 건물 안으로 들어갔다.\n"
	            + "\n"
	            + "이제 선택해야 한다. 건물 안으로 들어갈 것인가?\n"
	            + "아니면 다른 방법으로 그를 제압할 것인가?");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 건물 안으로 들어가 그를 추적한다.");
	    System.out.println("[2] : 주변을 탐색하며 다른 진입로를 찾는다.");
	    System.out.println("[3] : 잠시 기다리며 그의 다음 행동을 관찰한다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("건물 안으로 들어갔지만, 그는 이미 도망쳤다.\n"
	            + "추적에 실패하며 임무는 어려워졌다."
	            + "\n(멘탈 -1)");
	    stat.minusMental();
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("주변을 탐색하던 중, 비밀 통로를 발견했다!\n"
	            + "그 통로를 통해 목표물을 추적할 수 있었다.\n(멘탈 +1)");
	    stat.plusMental();
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("잠시 기다리며 그의 행동을 관찰했다.\n"
	            + "그는 건물 뒤쪽에서 탈출하려 했지만, 이를 포착해 제압했다.");
	}
}
