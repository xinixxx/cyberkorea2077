package gameSystem.event.story;

import gameSystem.event.Event;

public class IntroEvent001 extends Event{

	@Override
	public void viewText() {
		System.out.println("[인트로]\n"
				+"서기 2077년 세계는 기업에 의해 지배되고\n"
				+ "기업이 국가보다 강해져 서로 대립하는 시대가 되었다.\n"
				+ "\n"
				+ "빈부격차는 심해지고 길거리는 황폐화되었으며\n"
				+ "대한민국 정부는 위태롭기만 한 상황이다.\n"
				+ "\n"
				+ "주인공은 국가의 비밀요원으로서\n"
				+ "기업의 비밀 프로젝트를 감시하고\n"
				+ "기업간의 전쟁을 막기 위해 열심히 노력중이다.\n"
				+ "\n"
				+ "어느날 들려온 첩보에 따르면\n"
				+ "대한민국의 최고 기업인 \"사성\"에서\n"
				+ "천둥의 창이라는 비밀 미사일 프로젝트를 진행 중이고\n"
				+ "무정부상태에 가까운 북한에 이를 발사하여\n"
				+ "자신들의 영토를 확장하려는 작전을 알게되었다.\n"
				+ "\n"
				+ "당신은 집을 나서기 전...\n");
		
	}

	@Override
	public void viewChoice() {
		System.out.println("[1] : 마지막으로 든든한 식사를 한다");
		System.out.println("[2] : 보고있던 드라마의 마지막화를 시청한다");
		System.out.println("[3] : 어지러진 집을 정리한다");
	}

	@Override
	public void result1() {
		System.out.println("식사를 끝냈다. 포만감이 차오른다.\n(체력 +1)");
		stat.plusHp();
	}

	@Override
	public void result2() {
		System.out.println("너무 재밌는 드라마였다.\n놓쳤으면 후회할 뻔했다.\n(멘탈 +1)");
		stat.plusMental();
	}

	@Override
	public void result3() {
		System.out.println("집을 정리하다 서랍 틈새에 빠져있던 지폐를 발견했다.\n(돈 +1)");
		stat.plusMoney();
	}


}
