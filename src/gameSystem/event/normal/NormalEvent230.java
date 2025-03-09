package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent230 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		 System.out.println("적군의 아지트를 발견했다.\n"
		            + "건물은 평범해 보였지만 내부는 철저히 경비되어 있었다.\n"
		            + "\n"
		            + "곳곳에 경비병들이 배치되어 있어 접근이 쉽지 않았다.\n"
		            + "나는 잠시 멈춰 섰다.\n"
		            + "이곳은 중요한 정보를 얻을 수 있는 장소였다.\n"
		            + "\n"
		            + "내가 가진 장비와 기술로 침투할 방법을 고민했다.\n"
		            + "정보를 얻기 위해 위험을 감수해야 할까?\n"
		            + "\n"
		            + "아니면 신중히 행동하여 적군의 의심을 피해야 할까?\n"
		            + "결정을 내려야 할 순간이 다가왔다.");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 은밀히 침투하여 내부를 조사한다.");
		    System.out.println("[2] : 경비병을 제압하고 강제로 진입한다.");
		    System.out.println("[3] : 주변에서 정보를 수집하며 기회를 엿본다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("은밀히 침투하여 중요한 문서를 확보했다.");
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("경비병과 교전을 벌이며 진입했지만 부상을 입었다.\n(체력 -1)");
		    stat.minusHp();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("주변에서 정보를 수집하며 적군의 이동 패턴을 파악했다."
		    		+ "덕분에 생각보다 힘들이지 않고 적을 제압할 수 있었다.\n(체력 +1)");
		    stat.plusHp();
		}
}
