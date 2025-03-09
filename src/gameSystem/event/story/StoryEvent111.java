package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent111 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 11 / 20]\n"
				+"정치인들을 추적한 결과 추가적인 천둥의 창 위치를 알게 되었고"
				+ "\n그곳에 잠입해 정보를 탈취, 천둥의 창을 무력화하려고 계획했다."
				+ "\n위치는 정부를 무력화 하려고 하는 반란군의 베이스캠프였고"
				+ "\n난 작전을 바로 수행하려고 한다");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 반란군으로 위장해 고위 간부직 텐트처럼 보이는 곳을 들어간다.");
		System.out.println("[2] : 반란군의 통제실을 찾아본다.");
		System.out.println("[3] : 도청을 통해 반란군들의 대화를 듣는다.");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("고위 간부직 텐트 안에서 다음 천둥의 창"
				+ "\n발사 시간 등이 포함되어 있었다."
				+ "\n천둥의 창은 핵폭탄 이후 가장 무시무시한 무기다. 무조건 막아야한다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("반란군의 통제실을 생각보다 찾기 어려웠다."
				+ "\n한참을 헤멘 후 발견하였으나 앞에 무수히 많은 반란군들이 대기하고 있었다."
				+ "\n통제실에 접근하기에는 아직 무리가 있다고 판단하여 멀리서 지켜보았다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("도청을 통해 정부에 무언가를 실행시킬 거라는 간접적인 정보를 얻었다."
				+ "\n분열된 정부 내부에 스파이가 있을 것 같다는 생각이 들었고"
				+ "\n최악의 상황의 경우 대통령이 위험해질 수 있다는 생각도 들었다.");
	}

}
