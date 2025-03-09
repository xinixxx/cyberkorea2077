package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent203 extends Event {

	@Override
	public void viewText() {
		  System.out.println("며칠째 제대로 잠을 자지 못해 몸이 천근만근 무거웠다.\n"
		            + "눈꺼풀이 점점 무거워지고, 더 이상 버틸 수 없을 것 같았다.\n"
		            + "\n"
		            + "주변을 둘러보니 길바닥과 버려진 건물 외에는 쉴 곳이 없어 보였다.\n"
		            + "길바닥은 위험할 수 있지만, 잠시라도 눈을 붙이고 싶었다.\n"
		            + "\n"
		            + "버려진 건물은 더 안전해 보였지만, 안에 무언가 있을지도 모른다.\n"
		            + "그렇다고 위험을 감수하며 쉴 곳을 찾는 것도 두려웠다.\n"
		            + "\n"
		            + "그때!! 무엇인가 눈에 띄었다. 그것은 낡은 텐트였다.\n"
		            + "텐트 안에는 누군가 남겨둔 물건들이 있는 듯했다.\n"
		            + "이곳에서 쉬어갈 수 있을까? 아니면 더 큰 위험이 있을까?");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 텐트 안으로 들어가 물건을 확인한다.");
		    System.out.println("[2] : 텐트 주변을 살피며 안전을 확보한다.");
		    System.out.println("[3] : 텐트를 지나쳐 계속 이동한다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("텐트 안에서 남겨진 물건과 따뜻한 담요를 발견했다!\n(체력 +1)");
		    stat.plusHp();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("텐트 주변에서 들개 떼를 만나 체력을 소모했다.\n(체력 -1)");
		    stat.minusHp();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("텐트를 지나쳐 이동했지만, 아무 일도 일어나지 않았다.");
		}
}
