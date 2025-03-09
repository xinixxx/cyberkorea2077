package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent224 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		 System.out.println("길가에서 신문을 판매하고 있었다.\n"
		            + "판매대 위에는 다양한 신문들이 가지런히 놓여 있었다.\n"
		            + "\n"
		            + "판매원은 큰 소리로 외치고 있었다.\n"
		            + "\"오늘의 주요 뉴스! 꼭 확인하세요!\"\n"
		            + "\n"
		            + "지나가는 사람들은 가끔 발걸음을 멈췄다.\n"
		            + "몇몇은 신문을 사갔고, 몇몇은 그냥 지나쳤다.\n"
		            + "\n"
		            + "나는 잠시 고민하며 판매대를 바라보았다.\n"
		            + "신문을 살까? 아니면 그냥 지나칠까?");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 눈길만 주고 지나간다.");
		    System.out.println("[2] : 한 부를 구매한다. (돈 -1)");
		    System.out.println("[3] : 신문을 몰래 가져간다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("그냥 지나쳤다. 아무 일도 일어나지 않았다.");
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("구매한 신문은 평범한 광고로 가득 차 있었다.");
		    stat.minusMoney();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("신문을 몰래 가져가려다 판매원에게 들켰다.\n"
		            + "판매원이 소리치며 달려오자, 나는 당황해 도망쳤다.\n"
		            + "그러나 급히 달아나다 넘어져 부상을 입었다."
		            + "\n(체력 -1)");
		    stat.minusHp();
		}
}