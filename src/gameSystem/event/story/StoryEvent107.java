package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent107 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 7 / 20]\n"
				+ "천둥의 창 시스템을 일시적으로 무력화하긴 했지만"
				+ "\n시스템 내부에서 다른 천둥의 창 발사 위치를 알아냈다."
				+ "\n이러한 정보를 어떻게 알려야 할까?");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 정부에게 직접 보고한다");
		System.out.println("[2] : 커뮤니티에 공개적으로 올린다");
		System.out.println("[3] : 기자에게 제보한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("정부에서는 이 소식을 듣고 비상사태를 선포하였다."
				+ "\n국가의 입장으로서는 국민을 지키기 위한 어쩔 수 없는 선택이다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("이 일을 올리자마자 커뮤니티는 뒤집혔고"
				+ "\n\"사성\"의 이미지는 엄청나게 추락했다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("기사가 올라오고 나라는 충격에 뒤집혔다."
				+ "\n언론에서는 대서특필 되었으며 사람들은 두려움에 떨기 시작했다.");
	}

}
