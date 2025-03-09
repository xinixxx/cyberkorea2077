package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent215 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("발신자 제한으로 전화가 걸려왔다.\n"
	            + "수화기를 들자, 낯선 목소리가 들려왔다.\n"
	            + "\n"
	            + "그는 차분하지만 섬뜩한 목소리로 협박했다.\n"
	            + "아는 것을 말하지 않으면 가족들을 죽이겠다고 한다.\n"
	            + "\n"
	            + "나는 순간 얼어붙었다.\n"
	            + "이 상황은 너무나도 비현실적이었다.\n"
	            + "하지만 그의 목소리는 진지했고, 위협은 실재했다.\n"
	            + "\n"
	            + "전화를 끊어야 할까?\n"
	            + "아니면 그의 요구에 응해야 할까?\n"
	            + "혹은 시간을 벌며 그의 위치를 추적해야 할까?");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 스팸전화다. 전화를 끊자");
	    System.out.println("[2] : 협박범에게 응해 돈을 지불한다.(돈 -1)");
	    System.out.println("[3] : 협박범의 요구에 응하는 척 위치추적을 한다.(근력 필요)");
	}

	@Override
	public void result1() {
	    System.out.println("맞다 사실 나는 고아다. 가족은 우리집 뽀삐밖에 없다.\n(멘탈 -1)");
	    stat.minusMental();
	}

	@Override
	public void result2() {
		if(stat.getMoney()>0) {
			System.out.println("협박범은 돈만 챙기고 조용히 떠나갔다.\n(돈 -1)");
			stat.minusMoney();
		} else {
			System.out.println("협박범이 원하는 만큼의 돈은 내 수중에 없었다.."
					+ "\n난 평소에 연락하지 않던 사람들까지 전화하며 돈을 빌릴 수 밖에 없었다."
					+ "\n(멘탈 -1)");
		}
	}

	@Override
	public void result3() {
		if(inven.getGadget1()==1) {
			System.out.println("협박범의 위치를 추적한 뒤, 무력으로 제압했다.");
		} else {
			System.out.println("협박범의 위치를 추적했지만, 힘든 사투가 되었다.\n(체력 -1)");
		}
	}
}
