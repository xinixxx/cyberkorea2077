package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent229 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("적군의 본거지에서 임무를 수행하던 중,\n"
				+ "나는 이상한 낌새를 느꼈다.\n"
	            + "주변의 적군들이 나를 주시하는 것 같았다.\n"
	            + "\n"
	            + "순간, 경보음이 울리며 적군이 나를 향해 움직이기 시작했다.\n"
	            + "내가 비밀요원이라는 것이 들통난 것 같다.\n"
	            + "\n"
	            + "나는 빠르게 주변을 살폈다. 탈출구는 멀리 있었고,\n"
	            + "적군은 점점 가까워지고 있었다.\n"
	            + "\n"
	            + "이 상황에서 어떻게 해야 할까?\n"
	            + "직접 돌파할 것인가, 아니면 은밀히 따돌릴 것인가?");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 적군을 제압하며 직접 돌파한다.");
	    System.out.println("[2] : 주변의 은신처로 숨어 적군을 따돌린다.");
	    System.out.println("[3] : 탈출구로 빠르게 달려간다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("적군과 교전을 벌이며 돌파했지만, 부상을 입었다."
	    		+ "\n(체력 -1)");
	    stat.minusHp();
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("은신처에 숨어 적군을 따돌렸다. 잠시 숨을 고를 수 있었다."
	    		+ "\n(체력 +1)");
	    stat.plusHp();
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("탈출구로 달려가다 적군의 총격을 받았지만, 가까스로 빠져나왔다.");
	}

}
