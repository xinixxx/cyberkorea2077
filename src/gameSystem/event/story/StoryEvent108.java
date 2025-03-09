package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent108 extends Event {

	@Override
	public void viewText() {
		System.out.println("[메인 스토리 8 / 20]\n"
				+"국가는 비상사태를 선포하였고 나라는 충격에 빠졌다."
				+ "\n국제적으로 \"사성\" 은 비난받기 시작하였고"
				+ "\n\"사성\" 은 결국 반란군을 구성해 정부를 점거하려고 한다.");
		
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 국제 상황을 살펴본다");
		System.out.println("[2] : 국내 상황을 살펴본다");
		System.out.println("[3] : 익명의 다크웹을 살펴본다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("국제 사회는 한국과 사성을 비난중이며 "
				+ "\n사실 한국이 사성과 결탁해서 행동하는 자작극 아니냐 하는 의혹이 일어났다."
				+ "다행스럽게도 정부는 비상계엄령을 선포하여 사성과 선을 긋는 모습을 보여주었다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("국내에서는 사성이 뜨거운 감자에 올랐다."
				+ "\n사성을 옹호하는 쪽과 옹호하지 않는 쪽으로 나뉘어졌으며"
				+ "\n일부 과격한 시민은 거리에 화염병을 던지며 사람들을 위협했다."
				+ "\n정부는 이를 막고자 비상계엄령을 선포하였다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("다크웹에서는 한국이 비상계엄령을 선포하려고 한다는 소문이 돌았다."
				+ "\n소문을 낸 당사자의 출처는 확인할 수 없었지만 실제로 비상계엄령이 선포되었고"
				+ "\n한치 앞을 바라볼 수 없게 되었다.");
	}

}
