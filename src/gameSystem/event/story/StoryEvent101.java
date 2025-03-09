package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent101 extends Event{

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 1 / 20]\n"
				+ "어느날 정부에서 비밀 지령이 내려왔다. "
				+ "\n현재 한국에서 가장 큰 기업이자"
				+ "\n우리나라에서 가장 많은 용병을 보유하고 있는"
				+ "\n집단 \"사성\" 에서 비밀리에 무언가를"
				+ "\n준비중인것 같으니, 정보를 수집하라고 한다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : \"사성\"에 침투중인 요원에게 더 자세한 정보를 얻는다");
		System.out.println("[2] : \"사성\"의 서버를 해킹한다");
		System.out.println("[3] : \"사성\" 관련 기사 정보등을 확인한다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("\"사성\" 에서 비밀리에 미사일 프로젝트가 진행중이라는 정보를 입수하였다."
				+ "\n판매용으로 미사일을 만들기에는 크기에 비해"
				+ "\n너무 비밀스럽게 진행되고 있는 것 같아 수상하다...");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("\"사성\" 서버의 내부에서 미사일 형태의 청사진, 계획표를 발견하였다."
				+ "\n계획표에는 이니셜 PY 와 시간만 적혀있었다."
				+ "\n미사일 발사계획으로 유추되는데 PY는 뭐지..?");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("북한 관련 뉴스가 나오고 있다."
				+ "\n현재 북한은 평양의 지반 아래에 다이아몬드 대거 발견되어 그 다이아몬드를 차지하기 위해 내전 발발"
				+ "\n현재 무정부상태이며 평양의 지뢰 대거 함몰로 접근이 쉽지 않다고 한다");
	}

}
