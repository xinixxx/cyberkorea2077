package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent204 extends Event{

	@Override
	public void viewText() {
		System.out.println("평소에 잘 안 보던 책을 가방에 챙겨서 나왔는데,\n"
	            + "책이 너무 무거워서 짐이 되고 있었다.\n"
	            + "\n"
	            + "가방이 어깨를 짓누르는 느낌이 점점 더 강해졌다.\n"
	            + "책을 버릴까 고민했지만, 왠지 아까운 마음이 들었다.\n"
	            + "\n"
	            + "혹시 이 책 속에 중요한 무언가가 숨겨져 있을지도 모른다.\n"
	            + "하지만 계속 들고 다니자니 몸이 점점 지쳐갔다.\n"
	            + "\n"
	            + "책을 버리면 가벼워지겠지만, 후회가 남을지도 모른다.\n"
	            + "그렇다고 계속 들고 다니기엔 체력이 걱정됐다.\n"
	            + "\n"
	            + "나는 잠시 멈춰 섰다. 이 책을 어떻게 해야 할까?\n");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 평생 안 볼 것 같으니 그냥 버리고 간다.");
	    System.out.println("[2] : 잠시 멈춰 책을 펼쳐본다.");
	    System.out.println("[3] : 운동도 할 겸 그냥 들고 간다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("책을 버리고 가벼운 몸으로 이동했다. 아무 일도 없었다.");
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("책을 펼쳐보니, 페이지 사이에 열쇠가 숨겨져 있었다!\n(열쇠 +1)");
	    inven.setItem2(1);
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("책을 계속 들고 다녔지만, 체력만 소모되었다.\n(체력 -1)");
	    stat.minusHp();
	}
}
