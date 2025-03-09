package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent216 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		  System.out.println("어두운 암시장 골목에서 수상한 인물을 발견했다.\n"
		            + "그가 고개를 돌리더니 나와 눈이 마주쳤다.\n"
		            + "\n"
		            + "순간, 그의 손이 재킷 안으로 움직였다...\n"
		            + "무기를 꺼내려는 건가?\n"
		            + "아니면 단순한 움직임인가?\n"
		            + "\n"
		            + "주변의 소음이 멀어지고,\n"
		            + "그의 행동만이 내 시야를 지배했다.\n"
		            + "심장은 빠르게 뛰었고, 손끝은 차갑게 식어갔다.\n"
		            + "\n"
		            + "작전 중 예상치 못한 돌발상황이다.\n"
		            + "침착해야 한다...");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 시선을 피하고 자연스럽게 현장을 벗어난다.");
		    System.out.println("[2] : 신속히 접근해 신분을 확인하고 제압한다.");
		    System.out.println("[3] : 거리를 유지한 채 은밀히 미행하며 정보를 얻는다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("침착하게 시선을 돌리고 그곳을 빠져나왔다.\n"
		            + "위험한 상황을 피했고, 임무를 이어갈 수 있게 되었다");
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("그를 제압했지만... 이럴 수가?!\n"
		            + "그는 실제 정보국 요원이었고, 나를 의심하기 시작했다.\n"
		            + "작전은 꼬이기 시작했다...\n(멘탈 -1)");
		    stat.minusMental();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("조용히 거리를 유지하며 그의 뒤를 따랐다...\n"
		            + "그의 은신처 위치를 파악했고, 중요한 단서를 얻었다..\n(멘탈 +1)");
		    stat.plusMental();
		}
}