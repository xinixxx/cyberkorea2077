package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent114 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 14 / 20]\n"
				+ "가까스로 포위에 탈출하였다. 포위에 탈출했던 그 순간"
				+ "\n정보원으로부터 연락이 왔다."
				+ "\n현재 대통령실이 점거당했고 대통령은 비밀벙커로 피신하였다고 한다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 대통령의 비밀벙커는 어디 있을까?");
		System.out.println("[2] : 어떻게 대통령실이 점거당했나?");
		System.out.println("[3] : 대통령의 위치를 현재 반란군은 알고 있을까?");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("대통령의 비밀벙커는 현재 대부분의 고위 관계자들이 알기에"
				+ "\n아마 공사중인 벙커나 이제는 사용하지 않는 폐벙커로 이동했을 가능성이 큰것으로 보인다..");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("사성에서는 대통령실에 폭탄드론 테러를 하였다고 한다."
				+ "\n그 과정에서 많은 사람이 목숨을 잃고 고위 간부들도 중상을 입었다고 한다."
				+ "\n이러한 혼란스러운 틈을 타 \"사성\" 용병들이 진입하였고 그렇게 점거되었다고 한다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("다행스럽게도 반란군은 대통령의 위치를 끝까지 추적하지는 못한 것 같다."
				+ "\n대통령은 비밀루트로 이동하여 추적을 피했고 "
				+ "\n추적이 끊긴 반란군은 대통령을 암살하지 못했다고 한다.");
	}

}
