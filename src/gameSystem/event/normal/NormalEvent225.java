package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent225 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("병원은 오늘도 사람들로 북적이고 있었다.\n"
	            + "대기실에는 환자들과 보호자들이 가득 차 있었다.\n"
	            + "\n"
	            + "간호사들은 바쁘게 움직이며 환자들을 안내하고 있었다.\n"
	            + "어린아이의 울음소리와 보호자의 걱정스러운 목소리가 들렸다.\n"
	            + "\n"
	            + "나는 잠시 병원 한쪽에 앉아 상황을 지켜보았다.\n"
	            + "몸이 조금 피곤한 것 같아 잠시 쉬고 갈까 고민했다.\n"
	            + "\n"
	            + "기본적인 검사를 받아볼까? 아니면 정밀 검사를 받아볼까?\n"
	            + "혹은 그냥 물만 마시고 가는 게 나을까?");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 잠시 물만 마시고 가자.");
	    System.out.println("[2] : 기본적인 검사만 받아보자.");
	    System.out.println("[3] : 정밀 검사를 받아보자.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("물을 마시며 잠시 쉬었다. 건강이 최고다.");
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("기본 검사를 받은 후, 진통제를 처방받았다.\n(체력 +1)");
	    stat.plusHp();
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("정밀 검사를 받았지만, 별다른 이상은 없었다.\n(멘탈 +1)");
	    stat.plusMental();
	}
}
