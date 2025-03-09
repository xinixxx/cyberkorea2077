package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent221 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("어두운 밤, 근처의 폐가에서 이상한 소리가 들렸다...\n"
	            + "낡은 건물은 마치 오래된 비밀을 품고 있는 듯했다.\n"
	            + "\n"
	            + "바람이 불 때마다 창문이 덜컹거리고,\n"
	            + "벽 틈새로는 차가운 공기가 새어나왔다.\n"
	            + "\n"
	            + "소리는 낮고 불규칙했다.\n"
	            + "때로는 끽끽거리는 소리,\n"
	            + "때로는 무언가 긁히는 소리가 들렸다.\n"
	            + "\n"
	            + "나는 멈춰 섰다.\n"
	            + "폐가 안에서 무언가 움직이고 있었다.\n"
	            + "주변은 고요했지만,\n"
	            + "그 소리는 점점 더 가까워졌다.\n"
	            + "\n"
	            + "들어갈 것인가? 아니면 이곳을 떠날 것인가?\n"
	            + "결정을 내려야 할 순간이 다가왔다.");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 폐가 안으로 들어간다.");
	    System.out.println("[2] : 폐가를 멀리하며 안전을 택한다.");
	    System.out.println("[3] : 쓰레기를 던져 반응을 살펴본다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("폐가의 어두운 구석에서 열쇠를 발견했다!\n"
	            + "오래된 상자 속에 숨겨져 있던 열쇠는 빛나고 있었다.\n(열쇠 +1)");
	    inven.setItem2(1);
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("폐가를 멀리하며 안전을 선택했다.\n"
	            + "때로는 신중함이 생존의 열쇠다.");
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("쓰레기를 던지자 폐가 안에서 무언가 움직였다!\n"
	            + "깊이 잠들었던 늑대가 깨어났다.\n(체력 -1)");
	    stat.minusHp();
	}
}
