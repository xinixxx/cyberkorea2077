package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent222 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("광장의 중심에서 사성의 군대가 행진하고 있었다...\n"
	            + "그들의 발걸음은 무겁고 규칙적이었다.\n"
	            + "땅이 울리는 소리가 퍼졌다.\n"
	            + "\n"
	            + "군인들은 완벽히 정렬된 대형을 유지하며 앞으로 나아갔다.\n"
	            + "그들 사이에 휘날리는 깃발은 사성의 상징이었다.\n"
	            + "\n"
	            + "시민들은 숨죽인 채 그들을 지켜보고 있었다.\n"
	            + "누군가는 경의를 표하며 고개를 숙였고,\n"
	            + "누군가는 눈물을 흘리며 그들의 희생을 떠올렸다.\n"
	            + "\n"
	            + "나는 그 장엄한 광경 앞에서 발걸음을 멈췄다.");
	}

	@Override
	public void viewChoice() {
	    // TODO Auto-generated method stub
	    System.out.println("[1] : 조용히 고개를 숙이며 경의를 표한다.");
	    System.out.println("[2] : 군인들을 향해 \"당신들의 희생에 감사합니다.\"라고 외친다.");
	    System.out.println("[3] : 그들의 행진에 맞춰 가슴에 손을 얹고 경례를 한다.");
	}

	@Override
	public void result1() {
	    // TODO Auto-generated method stub
	    System.out.println("조용히 고개를 숙이며 경의를 표했다...\n"
	            + "군인들은 묵묵히 행진을 이어갔고, 시민들은 당신의 행동에 감동했다.\n(멘탈 +1)");
	    stat.plusMental();
	}

	@Override
	public void result2() {
	    // TODO Auto-generated method stub
	    System.out.println("\"당신들의 희생에 감사합니다.\"라고 외치자...\n"
	            + "군인들 중 한 명이 고개를 돌려 미소를 지으며 답했다.\n"
	            + "그 순간, 주변 시민들도 당신의 말에 동조하며 박수를 보냈다.\n(멘탈 +1)");
	    stat.plusMental();
	}

	@Override
	public void result3() {
	    // TODO Auto-generated method stub
	    System.out.println("가슴에 손을 얹고 경례를 하자...\n"
	            + "행렬 중 한 군인이 잠시 멈춰 서서 나를 향해 경례를 돌려주었다.\n"
	            + "그 짧은 순간, 나는 그들의 진심과 무게를 느낄 수 있었다.\n(멘탈 +1)");
	    stat.plusMental();
	}
}