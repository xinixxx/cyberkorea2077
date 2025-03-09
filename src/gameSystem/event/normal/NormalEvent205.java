package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent205 extends Event {

	@Override
	public void viewText() {
		 System.out.println("어디선가 맛있는 냄새가 풍겨왔다.\n"
		            + "냄새는 점점 강해졌고, 배가 더 고파졌다.\n"
		            + "\n"
		            + "냄새의 근원지가 궁금했지만, 어딘지 알 수 없었다.\n"
		            + "혹시 누군가 음식을 먹고 있는 걸까?\n"
		            + "\n"
		            + "하지만 이 상황에서 무작정 따라가도 괜찮을까?\n"
		            + "냄새를 따라가야 할까, 아니면 그냥 지나쳐야 할까?");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 배고프니 냄새를 따라가본다.");
		    System.out.println("[2] : 그냥 무시하고 지나친다.");
		    System.out.println("[3] : 혹시 함정일 수도 있으니 주변을 살펴본다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("냄새를 따라갔더니, 버려진 음식이었다. 먹을 수 없었다.\n(체력 +1)");
		    stat.plusHp();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("그냥 지나쳤다. 아무 일도 일어나지 않았다."
		    		+ "하지만 꼬르륵 거리는 소리에 살짝 후회가 되기 시작했다."
		    		+ "그냥 먹을걸 그랬나...\n(멘탈 -1)");
		    stat.minusMental();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("주변을 살펴보니, 누군가 음식을 먹고 있었다. 아무 일도 없었다.");
		}

}
