package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent112 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 12 / 20]\n"
				+"여러가지 정보를 종합했을때 어느 하나라도 막지 못하면 정말 최악의 상황이 될 것 같다고 생각했다."
				+ "\n이건 비상상황이다. 하지만 여기서 내가 할수 있는 선택은 한정적이다"
				+ "\n난 어떻게 해야하지?");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 정부와의 연락을 시도한다");
		System.out.println("[2] : 일단 천둥의 창부터 막자");
		System.out.println("[3] : 직접 대통령의 위치로 이동한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("정부와의 연락을 시도하려던 그때 반란군 중 한명이 나의 수상함을 눈치챘다."
				+ "\n 수상함을 느낀 반란군이 나에게 접근했고"
				+ "\n 도망치려던 나는 반란군에게 포위됐다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("천둥의 창을 먼저 저지하는게 나라의 목표이다."
				+ "\n 통제실에 접근하려던 그때 반란군이 수상함을 느끼고 나에게 접근했다."
				+ "\n 급하게 몸을 피하려고 했지만 모두의 추적을 피하기엔 어려웠다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("대통령의 생사를 확인하려고 이동하는게 좋다고 생각했다."
				+ "\n 하지만 대열에서 이탈하는 나를 보며 반란군들이 수상함을 느꼈다."
				+ "\n 반란군 고위 간부가 대열에서 이탈하는 나를 가리켜 모두의 이목이 나에게 쏠렸다.");
	}

}
