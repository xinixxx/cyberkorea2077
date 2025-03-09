package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent104 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 4 / 20]\n"
				+ "\"사성\" 사옥에서 미사일 발사 예정을 확인하였다."
				+ "\n난 건물에 침입해 미사일 발사를 저지하려고 한다."
				+ "\n사옥에 침투해 미사일 컨트롤 위치를 찾아보자"
				+ "\n현재 사옥 엘리베이터는 B1층, 2층, 6층만 이용이 가능하다...");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : B1층 컨트롤 룸으로 이동한다");
		System.out.println("[2] : 2층 식당으로 이동한다.");
		System.out.println("[3] : 6층 통제실로 이동한다.");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("컨트롤 룸에서 감시중이던 용병에게 걸려 잠입을 들켜버렸다."
				+ "\n 약간의 부상을 입고 추적을 따돌렸다. (체력 -1)");
		stat.minusHp();
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("식당에는 진짜 식당만 존재했다."
				+ "\n아무리 둘러봐도 이곳의 2층은 식당밖에 없었다."
				+ "\n평소에 사람이라도 있어야 할 식당이 오늘은 매우 조용하다."
				+ "\n조리대에 놓여있던 초콜렛을 입에 넣고 다시 조심히 움직였다."
				+ "\n(체력 +1)");
		stat.plusHp();
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("6층에서 감시중인 수많은 용병을 발견했다."
				+ "\n이곳에서 무언가 수상한 활동이 진행중인 것 같다."
				+ "\n주변에서는 천둥의 창 이라는 말이 나오고 있다..");
	}

}
