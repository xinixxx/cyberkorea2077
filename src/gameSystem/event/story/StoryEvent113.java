package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent113 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 13 / 20]\n"
				+"결국 나는 반란군에게 포위되기 직전이다."
				+ "\n 여기서 어떻게든 도망가야 한다."
				+ "\n가진것은 권총 한자루, 수류탄 한발이다");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 수류탄을 반란군에게 직접 던진다");
		System.out.println("[2] : 권총으로 위협하며 반란군과 대치 상황을 이루다 도망간다 (권총 필요)");
		System.out.println("[3] : 수류탄으로 근처 구조물을 부숴서 접근을 못하게 한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("수류탄을 반란군에게 던져 큰 피해를 입혔으나"
				+ "\n수류탄의 큰 피해범위로 인해 나도 피해를 면치는 못하게 되었다."
				+ "\n(체력 -1)");
		stat.minusHp();
	}

	@Override
	public void result2() {
		if(inven.getItem3()==1) {
			System.out.println("상대는 소총이였으나 반란군은 생각보다 훈련을 많이 받지 못해"
					+ "\n사용이 능숙하지 못했다."
					+ "\n악착같이 교전한 끝에 전장을 벗어날 수 있었다.");
		} else {
			System.out.println("급하게 품을 뒤져봤지만, 권총이 나오는 일은 없었다."
					+ "\n결국 수류탄을 반란군에게 던져 큰 피해를 입혔으나"
					+ "\n수류탄의 큰 피해범위로 인해 나도 피해를 면치는 못하게 되었다."
					+ "\n(체력 -1)");
			stat.minusHp();
		}
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("난 근처에 있는 물탱크 구조물을 폭파시켰다."
				+ "\n 통제실도 처리하고 싶었지만 아쉽게도 처리하지 못했다."
				+ "\n수류탄의 큰 피해범위로 인해 나도 피해를 면치는 못하게 되었다."
				+ "\n(체력 -1)");
		stat.minusHp();
	}

}
