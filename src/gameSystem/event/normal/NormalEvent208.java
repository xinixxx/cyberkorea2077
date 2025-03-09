package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent208 extends Event {

	@Override
	public void viewText() {
		System.out.println("저 멀리 사람들이 모여 팔씨름을 하고 있다.\n"
	            + "흥미로운 분위기가 느껴졌고,\n"
	            + "사람들의 함성이 들려왔다.\n"
	            + "\n"
	            + "팔씨름에 참여하는 사람들은 하나같이 자신감이 넘쳐 보였다.\n"
	            + "그들 중 몇몇은 꽤 강해 보였고,\n"
	            + "승부욕이 가득했다.\n"
	            + "\n"
	            + "나는 잠시 멈춰 섰다.\n"
	            + "이 상황에서 무엇을 해야 할까?\n"
	            + "그냥 구경만 할지,\n"
	            + "아니면 다른 길로 돌아갈지 고민이 들었다.\n"
	            + "\n"
	            + "하지만 나는 팔씨름 고수다.\n"
	            + "이곳에서 나를 이길 사람은 없을 것이다.\n"
	            + "모두를 발라버릴 준비가 됐다.\n"
	            + "이제 나의 실력을 보여줄 때다!");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 구경하면서 심심풀이를 한다.");
	    System.out.println("[2] : 괜히 안 좋은 일이 생길 수 있으니 다른 길로 돌아간다.");
	    System.out.println("[3] : 흔치 않은 상황이니 팔씨름에 참여를 해 본다. (근력 필요)");
	}

	@Override
	public void result1() {
	    System.out.println("꽤나 재미있는 구경이었다.\n(멘탈 +1)");
	    stat.plusMental();
	}

	@Override
	public void result2() {
	    System.out.println("다른 길로 돌아가다가 길바닥에 떨어져있는 붕대를 주웠다.\n(붕대 +1)");
	    inven.setItem1(1);
	}

	@Override
	public void result3() {
		if(inven.getGadget1()==1) {
			System.out.println("비밀 요원을 우습게 보지 마시라!"
					+ "\n그 곳에 있는 모든 사람들을 꺾고 우승을 차지했다."
					+ "\n(돈 +1)");
			stat.plusMoney();
		}else {
			System.out.println("팔씨름을 하다가 그냥 체력만 소진 되었다.\n(체력 -1)");
			stat.minusHp();
		}
	}

}
