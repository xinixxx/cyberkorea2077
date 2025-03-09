package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent226 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("빈민가 거리에서 정부의 쌀 배급이 진행 중이었다.\n"
	            + "사람들은 긴 줄을 서서 배급받기를 기다리고 있었다.\n"
	            + "\n"
	            + "줄 앞쪽에서는 군인들이 질서를 유지하고 있었다.\n"
	            + "아이들은 배급받은 쌀을 들고 기뻐하며 뛰어다녔다.\n"
	            + "\n"
	            + "줄 끝에 선 사람들은 초조한 표정으로 기다리고 있었다.\n"
	            + "쌀이 모두 떨어질까 걱정하는 듯했다.\n"
	            + "\n"
	            + "나는 이 광경을 보며 잠시 멈춰 섰다.\n"
	            + "무엇을 해야 할지 고민이 들기 시작했다.");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 줄에 서서 쌀을 배급받는다.");
	    System.out.println("[2] : 아이들에게 쌀을 나눠준다.");
	    System.out.println("[3] : 조용히 상황만 지켜보고 떠난다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("줄에 서서 쌀을 배급받았다. 따뜻한 밥 한 끼는 소중하다."
	    		+ "\n(돈 +1)");
	    stat.plusMoney();
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
		if(stat.getMental()>0) {
			System.out.println("아이들에게 쌀을 나눠주자 그들의 얼굴에 미소가 번졌다."
					+ "\n(돈 -1, 멘탈 +1)");
			stat.minusMoney();
			stat.plusMental();
		} else {
			System.out.println("주머니를 뒤졌지만 나눠줄만한 물건은 아무것도 나오지 않았다.");
		}
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("조용히 상황만 지켜보다 떠났다. 빈민가는 여전히 분주했다.");
	}
}