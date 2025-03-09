package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent115 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 15 / 20]\n"
				+"정부에서 비밀리에 비밀 벙커의 위치를 알려주었다."
				+ "\n다만 \"사성\"의 대통령실 점거 이후 그들의 시민 감시는 더욱 심해졌다"
				+ "\n정부에서 준 주소로 추적을 피해 이동해야 한다");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 도보로 천천히 추적을 피해 이동한다.");
		System.out.println("[2] : 일반 시민인척 오토바이로 이동한다.");
		System.out.println("[3] : 세단을 타고 이동한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("오래 걸리긴 했지만 그래도 도착에 성공했다."
				+ "\n 중간중간 검문검색을 하는 용병들을 마주쳤으나"
				+ "\n 다행스럽게도 들키지 않았다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("오토바이로 이동하던 도중, 검문검색을 당했다."
				+ "\n\"사성\" 내부에 있던 사성침입 흔적 얼굴과 내 얼굴이 일치하여"
				+ "\n 힘든 추격전 끝에 그들을 떼어놓는데 성공했다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("검문검색을 하던 용병들은 생각보다 멍청했다."
				+ "\n그들은 나의 자동차를 보고 자동으로 길을 열어주었고"
				+ "\n그 어느것보다 편하게 도착할 수 있었다.");
	}

}
