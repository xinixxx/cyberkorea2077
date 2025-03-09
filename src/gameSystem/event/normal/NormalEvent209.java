package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent209 extends Event {

	@Override
	public void viewText() {
		System.out.println("저 멀리 한 꼬마 남자아이가 나에게 말을 걸어왔다.\n"
	            + "그의 옷은 낡았고,\n"
	            + "얼굴에는 먼지가 묻어 있었다.\n"
	            + "\n"
	            + "꼬마는 조심스럽게 내 쪽으로 다가왔다.\n"
	            + "그의 눈빛은 어딘가 간절해 보였다.\n"
	            + "\n"
	            + "나는 잠시 멈춰 섰다.\n"
	            + "그저 도움을 구하는 것일까,\n"
	            + "아니면 다른 이유가 있을까?\n"
	            + "\n"
	            + "이 상황에서 내가 어떻게 행동해야 할까\n"
	            + "조금 안쓰러워 보이긴 하지만...\n"
	            + "꼬마의 말을 들어볼까, \n"
	            + "아니면 그냥 지나칠까?\n");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 무슨 얘기를 하는지 들어본다.");
	    System.out.println("[2] : 무시하고 가던 길 간다.");
	    System.out.println("[3] : 배고파 보이니 남는 식량을 나눠준다. (돈 -1)");
	}

	@Override
	public void result1() {
	    System.out.println("기구한 인생이다. 괜히 죄책감만 생기고 말았다.\n(멘탈 -1)");
	    stat.minusMental();
	}

	@Override
	public void result2() {
	    System.out.println("아무 일도 일어나지 않았다.");
	}

	@Override
	public void result3() {
		if(stat.getMoney()>0) {
			System.out.println("꼬마는 내가 건내준 식량을 허겁지겁 먹기 시작했다."
					+ "\n식량을 다 먹은 꼬마는 날 빤히 쳐다보더니"
					+ "\n품 속에서 무언가를 주섬주섬 꺼내 건내주었다."
					+ "\n\"저-기서 주운건데, 가지세요."
					+ "\n들고 있어봐야 위험하기만 해서요\""
					+ "\n"
					+ "\n예상치 못한 금속의 감촉에, 살짝 놀라고 말았다. (권총 +1)");
			stat.minusMoney();
			inven.setItem3(1);
		} else {
			System.out.println("뭐라도 꺼내주고 싶었지만, 내 손에 남은게 없었다."
					+ "\n꼬마는 주머니를 뒤적이는 날 빤히 쳐다보다가"
					+ "\n실망한 듯 떠났다.");
		}
	}

}
