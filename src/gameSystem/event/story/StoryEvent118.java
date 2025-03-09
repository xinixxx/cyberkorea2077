package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent118 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 18 / 20]\n"
				+ "\"사성\"의 간부는 지금이 아니면 천둥의 창 발사 기회가 없다고 생각한 것 같다."
				+ "\n숨어있던\"사성\"의 최고간부는 통제실에 들어가 문을 잠그고 천둥의 창 시스템을 열기 시작했다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 통제실의 문을 부순다(근력 사용)");
		System.out.println("[2] : 통제실의 문 손잡이를 총으로 부순다(권총 사용)");
		System.out.println("[3] : 통제실의 문을 수류탄으로 터트린다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		if(inven.getGadget1()==1) {
			System.out.println("통제실의 문을 깔끔하게 부숴버렸다.");
		} else {
			System.out.println("통제실의 문은 생각보다 단단했다."
					+ "\n문을 부수다 삐끗했는지 허리가 욱씬거린다.\n(체력 -1)");
			stat.minusHp();
		}
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		if(inven.getItem3()==1) {
			System.out.println("총으로 문 손잡이를 깔끔하게 부순 뒤, 통제실에 진입했다.");
		} else {
			System.out.println("주머니엔 총 대신 주먹만 남아있었다."
					+ "\n결국 힘으로 통제실의 문을 부수기로 했다."
					+ "\n통제실의 문은 생각보다 단단했고,"
					+ "\n문을 부수다 삐끗했는지 허리가 욱씬거렸다.\n(체력 -1)");
			stat.minusHp();
		}
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("수류탄의 충격으로 인해 약간의 충격을 받았다.\n(체력 -1)");
		stat.minusHp();
	}

}
