package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent105 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 5 / 20]\n"
				+"미사일 컨트롤 룸을 알아내서 룸 근처로 이동했다. "
				+ "\n주변에 있는 용병들을 일단 처리해야 한다."
				+ "\n가장 효과적인 방법을 찾아내야 한다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 최루탄을 이용해 쫒아낸다");
		System.out.println("[2] : 육탄전을 벌인다 (근력 필요)");
		System.out.println("[3] : 총을 사용한다 (권총 필요)");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("용병들을 효과적으로 쫒아냈다."
				+ "\n혼란스러운 틈을 타 컨트롤 룸에 진입했다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		if(inven.getGadget1()==1) {
			System.out.println("허약한 놈들. 육탄전에 승리하여 컨트롤 룸에 쉽게 들어갈 수 있었다."
					+ "\n용병의 주머니에서 약간의 돈을 챙겼다."
					+ "\n(돈 +1)");
			stat.plusMoney();
		} else {
			System.out.println("용병과의 육탄전은 쉽지 않았다."
					+ "\n약간의 부상을 입고 컨트롤 룸에 진입했다.\n(체력 -1)");
			stat.minusHp();
		}
	}

	@Override
	public void result3() {
		if(inven.getItem3()==1) {
			System.out.println("재빠르게 총을 꺼내 용병들을 제압했다."
					+ "\n사격전에 승리하여 컨트롤 룸에 쉽게 들어갈 수 있었다."
					+ "\n용병의 주머니에서 약간의 돈을 챙겼다."
					+ "\n(돈 +1)");
			stat.plusMoney();
		} else {
			System.out.println("급하게 품을 뒤져봤지만 총은 나오지 않았다."
					+ "\n결국 용병에게 달려들어 치고박고 싸우는 수밖에 없었다."
					+ "\n용병과의 육탄전은 쉽지 않았다."
					+ "\n약간의 부상을 입고 컨트롤 룸에 진입했다.\n(체력 -1)");
			stat.minusHp();
		}
	}

}
