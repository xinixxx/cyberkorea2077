package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent117 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 17 / 20]\n"
				+"정부와의 작전으로 전쟁이 시작되었다."
				+ "\n 하지만 생각 이상으로 국군이 밀리는 모습을 보여주고 있어"
				+ "\n 시급하게 도움을 줘야할 것 같다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 최루탄 등을 살포한다");
		System.out.println("[2] : 수류탄을 던진다");
		System.out.println("[3] : 지원사격을 진행한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("최루탄은 아군의 입장에서는 좋은 판단이였으나"
				+ "\n최루탄으로 인해 반란군의 이목이 나에게 집중되었다."
				+ "\n하지만 기적적으로 부상은 당하지 않았다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("수류탄을 던져 반란군을 효과적으로 처리하였다."
				+ "\n다만 아군에게도 수류탄이 날아가"
				+ "\n 아군에게 약간의 피해를 입혔다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("국군의 총을 빌려 지원사격을 진행했고, 효과적으로 반군을 처리하였다."
				+ "\n 다만 반란군이 국군의 저격수 위치를 일부 알게 되어"
				+ "\n 후퇴시 상황이 약간 곤란해질 것 같다");
	}

}
