package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent103 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 3 / 20]\n"
				+"정보를 종합해 본 결과 \"사성\" 에서"
				+ "\n무시무시한 프로젝트를 준비중이란걸 알게 되었다.."
				+ "\n 내전으로 혼란스러운 북한을 타격해서 본인들의 땅으로 만들려고 하다니.."
				+ "\n 이 계획을 막을 준비를 해야 한다...");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 모든 요원들을 집결, 저지 작전을 수행한다");
		System.out.println("[2] : 사람이 많으면 오히려 들킬 위험이 있다. 단독 임무 수행을 시작한다.");
		System.out.println("[3] : 상황을 지켜보았다가 나중에 행동한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("요원들이 응답하지 않는다...어쩌지?"
				+ "\n어쩔수 없이 단독 임무로 들어가야겠다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("미리 싹을 뽑아서 저지를 해야 국가적으로 문제가 일어나지 않는다."
				+ "\n초동 조치 및 정보 수집을 위해 \"사성\" 의 사옥으로 이동한다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("상황이 점점 심각해진다는 정부의 연락을 받았다. 저지 임무를 수행해야겠다.");
	}

}
