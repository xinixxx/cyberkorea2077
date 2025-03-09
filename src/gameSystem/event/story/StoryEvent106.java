package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent106 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 6 / 20]\n"
				+ "드디어 미사일 컨트롤 룸에 진입.."
				+ "\n미사일 발사를 막아야 한다"
				+ "\n룸 내부에 있는 천둥의 창 시스템이 신경쓰인다..");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 컴퓨터에 있는 천둥의 창 시스템에 로그인한다");
		System.out.println("[2] : 컴퓨터들을 부숴버린다");
		System.out.println("[3] : 컴퓨터 앞에 있는 조작시스템을 건드린다.");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("천둥의 창 시스템은 안면인식을 통해 로그인할 수 있나보다."
				+ "\n어쩔 수 없이 난 무력을 사용하였다."
				+ "\n힘으로 컴퓨터를 부숴버리자, 시스템이 무력화되었다.");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("생각보다 컴퓨터는 잘 부숴지지 않았다."
				+ "\n하지만 그럼에도 나는 해결했고 시스템이 꺼지는 것을 확인했다."
				+ "\n무식하지만 확실한 방법이다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("생각보다 앞의 조작 시스템은 간단했다."
				+ "\n평소 갈고닦은 폭탄 해체 스킬을 이용하여"
				+ "\n컴퓨터와의 연결을 끊어 시스템을 무력화하였다.");
	}

}
