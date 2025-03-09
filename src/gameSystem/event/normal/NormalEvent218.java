package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent218 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("정부에서 긴급하게 지시가 내려왔다\n"
				+ "임무를 수행할 것인가?\n"
				+ "사이버펑크 서울, 혼란스러운 도시의 밤,\n"
				+ "낡은 단말기에서 긴급 메시지가 번쩍인다.\n"
				+ "\n"
				+ "정부 특수 부서에서 보낸 암호화된 지령이다.\n"
				+ "내용은 극비 사항.\n"
				+ "\n"
				+ "상부는 자네의 능력을 높이 평가하고 있으며, \n"
				+ "이번 임무의 적임자로 판단했다.\n"
				+ "\n"
				+ "임무는 위험하며 성공 가능성은 희박하다. \n"
				+ "하지만 실패할 경우 도시 전체가 위험에 빠질 수 있다.\n"
				+ "\n"
				+ "자네의 선택에 따라 한국의 운명이 결정될 것이다. \n"
				+ "부디 현명한 판단을 기대한다\n"
				+ "\n"
				+ "정부의 메시지는 짧고 간결했지만, \n"
				+ "그 무게는 도시 전체를 짓누르는듯 하다...\n");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 즉시 임무를 수락하고 진행한다.");
		    System.out.println("[2] : 위험 부담이 너무 커 임무를 거부한다.");
		    System.out.println("[3] : 임무를 최소한으로 수행하며 위험을 줄인다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("임무를 성공적으로 완수하였다!\n"
		            + "도시는 안전해졌고, 당신의 이름은 영웅으로 기록될 것이다."
		            + "\n(멘탈 +1)");
		    stat.plusMental();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("임무를 거부했다...\n"
		            + "그러나 이는 치명적인 결과를 초래했다.\n"
		            + "정부는 대체 인력을 투입했지만, 작전은 실패로 끝났다.\n"
		            + "\n"
		            + "도시 곳곳에서 폭발이 일어나고, 치명적인 바이러스가 퍼졌다...\n"
		            + "한국 전체가 혼란에 빠졌고, 수많은 생명이 희생되었다.\n"
		            + "\"자네의 선택이 이 모든 것을 불러온 것이다.\""
		            + "\n(멘탈 -2)");
		    stat.minusMental();
		    stat.minusMental();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("임무를 대충 처리했지만...\n"
		            + "최소한의 목표는 달성했다. 기운이 남아 있다.\n(체력 +1)");
		    stat.plusHp();
		}
}