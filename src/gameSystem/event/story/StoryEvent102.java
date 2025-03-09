package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent102 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 2 / 20]\n"
				+"추가적으로 정보를 찾아본 결과.."
				+ "\n사성에서는 자기들이 쓸 미사일을 만든다고 한다"
				+ "\n하지만 왜? 미사일을 쓰려고 하는지에 대해서는 아직도 의문이다"
				+ "\n아무리 사성이라지만...기업이 미사일을 소유하는게 맞는건가...?");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 미사일의 정보를 조사한다");
		System.out.println("[2] : 사성의 비밀 계획표를 더 조사한다");
		System.out.println("[3] : 현재 국가 정세의 분위기를 생각해본다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("미사일의 이름은 천둥의 창이라고 한다. "
				+ "\n레일건을 기반으로 만들어진 미사일이라 핵폭탄보다 더 강한 위력을 낸다고 한다");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("미사일의 발사 시각인 것 같다. 매우 중요한 정보를 발견하였다.\n(멘탈 +1)");
		stat.plusMental();
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("현재 북한의 상황은 정말 최악이다."
				+ "\n평양에서 대규모 다이아몬드 광산 발견, 그로 인한 내전으로 인해"
				+ "\n평양은 사실상 무정부 상태이다.");
	}

}
