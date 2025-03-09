package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent109 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 9 / 20]\n"
				+ "정부 내부에서도 갑론을박이 일어났다."
				+ "\n계엄령을 찬성하는 쪽에서는 충분히 국제사회에"
				+ "\n문제가 될 수 있는 행동이니 해야 한다고 한다."
				+ "\n계엄령을 반대하는 입장에서는 시대가 어느 시대인데"
				+ "\n예전이였으면 모르겠으나 지금은 기업이 미사일 좀 쏠 수 있지 라고 생각 한다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 찬성파 입장을 더 들어본다");
		System.out.println("[2] : 반대파 입장을 더 들어본다");
		System.out.println("[3] : 제 3자의 입장을 들어본다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("찬성파는 반대파중에 사성과 결탁한 인물이 있을 것이라고 생각한다."
				+ "\n그도 그럴것이 사성이 정부 인사들에게 뇌물을 주고 있다는 소문은 유명했다."
				+ "\n그 뇌물은 결국 큰 사건을 만들게 될 것 같다고 난 생각한다....");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("반대파는 정부가 이때를 틈타 권력을 강화하려고 하고 있다고 생각하고 있다."
				+ "\n무능한 권력을 올리는 방법을 올리기 좋은 때는 바로 지금이긴 하다."
				+ "\n하지만 그래도 이번 계엄령은 합리적으로 옳은 판단이라고 생각한다...");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("시민들 입장에서 이런 상황은 두려움만 가중시킬 뿐이다.."
				+ "\n시민들은 하루빨리 일상으로 돌아가고 싶은 마음 뿐이다."
				+ "\n시민들은 아무 잘못이 없이 순수 피해자다...");
	}

}
