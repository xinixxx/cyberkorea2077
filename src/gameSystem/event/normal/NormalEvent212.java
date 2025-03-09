package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent212 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("정부에서 비밀문서를 보내라는 연락이 왔다.\n"
	            + "하지만 이번 연락은 평소와는 달랐다.\n"
	            + "\n"
	            + "기존에 사용하던 정부의 연락책이 아니라는 점이 의심스러웠다.\n"
	            + "혹시 적의 함정일지도 모른다는 생각이 들었다.\n"
	            + "\n"
	            + "비밀문서는 작전의 핵심 정보를 담고 있다.\n"
	            + "만약 잘못된 손에 넘어간다면,\n"
	            + "큰 문제가 생길 것이다.\n"
	            + "\n"
	            + "나는 잠시 멈춰 섰다.\n"
	            + "이 문서를 보내야 할까?\n"
	            + "아니면 보내지 말아야 할까? 아니면 일부만 보낼까?");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 문서를 보낸다");
	    System.out.println("[2] : 문서를 보내지 않는다");
	    System.out.println("[3] : 문서 중 중요한 부분을 제외하고 보낸다");
	}

	@Override
	public void result1() {
	    System.out.println("정부의 작전임무에 큰 도움이 되었다."
	    		+ "\n특별 성과급이 지급되었다."
	    		+ "\n(돈 +1)");
	    stat.plusMoney();
	}

	@Override
	public void result2() {
	    System.out.println("문서를 보내지 않았지만, 정부에서는 아무런 연락도 오지 않았다."
	    		+ "\n역시 적의 함정이었던 것일까..?.");
	}

	@Override
	public void result3() {
	    System.out.println("문서의 완전하지 않은 정보로 인해 정부 작전임무에 차질이 생겼다."
	    		+ "\n전화로 들려오는 상사의 잔소리에 머리가 아파온다.\n(멘탈 -1)");
	    stat.minusMental();
	}

}
