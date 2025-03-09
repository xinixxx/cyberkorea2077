package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent116 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 16 / 20]\n"
				+"본격적으로 반란군과의 대치 작전을 세우기 시작했다."
				+ "\n전면전을 펼칠지, 기습전을 펼칠지 고민중이다");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 전면전으로 해결한다");
		System.out.println("[2] : 기습전으로 승부를 본다");
		System.out.println("[3] : 분대별로 전면전, 기습전으로 나눈다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("전면전으로 상황을 혼란하게 만든 뒤"
				+ "\n 내가 뒤에서 몰래 침투, 시스템 무력화를 진행한다");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("기습전으로 상황을 혼란하게 만들어"
				+ "\n 빠르게 통제실에 침투해 시스템을 무력하려고 한다");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("전면전을 통해 주의를 끌고 "
				+ "\n나머지 인원이 뒤에서 기습을 하는 작전을 진행한다");
	}

}
