package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent217 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("폐허가 된 건물 안,\n"
				+ "나는 낯선 발소리를 들었다.\n"
	            + "발소리는 점점 가까워졌고, 나는 숨을 죽였다.\n"
	            + "\n"
	            + "잠시 후, 그림자가 벽에 드리워졌다...\n"
	            + "누군가가 천천히 문을 열고 안으로 들어왔다.\n"
	            + "\n"
	            + "그는 주변을 살피며 무언가를 찾는 듯했다.\n"
	            + "손에는 권총이 쥐어져 있었다.\n"
	            + "긴장감이 온몸을 휘감았다.\n"
	            + "\n"
	            + "지금 행동하지 않으면 들킬지도 모른다.\n"
	            + "숨막히는 순간이다.");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 조용히 몸을 숨기며 상황을 지켜본다.");
	    System.out.println("[2] : 그를 기습해 제압한다. (근력 필요)");
	    System.out.println("[3] : 다른 출구를 찾아 은밀히 탈출한다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("그는 주변을 살피다 결국 방을 떠났다...\n"
	            + "나는 힘들이지 않고 무사히 상황을 넘겼다.\n(체력 +1)");
	    stat.plusHp();
	}

	@Override
	public void result2() {
		if(inven.getGadget1() == 1) {
			System.out.println("조용히 그의 뒤로 돌아가, 재빠르고 강하게 제압했다."
					+ "\n이제 이 권총은 제 총입니다."
					+ "\n(권총 +1)");
			inven.setItem3(1);
		} else {
			System.out.println("기습에 성공했지만, 그의 저항은 예상보다 강했다...\n"
					+ "몸싸움 끝에 부상을 입었고, 작전은 더 어려워졌다.\n(체력 -1)");
			stat.minusHp();
		}
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("다른 출구를 찾아 탈출하려 했지만...\n"
	            + "출구가 막혀 있어 결국 그는 나를 발견하고 말았다.\n"
	            + "긴박한 상황 속에서 겨우 도망쳤지만, 부상을 입고 말았다.\n(체력 -1)");
	    stat.minusHp();
	}
}