package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent228 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		 System.out.println("너무 배고픈 와중, 길가에 떨어져 있는 햄버거를 발견했다!\n"
		            + "겉보기에는 꽤 먹음직스러워 보였다.\n"
		            + "\n"
		            + "하지만 길가에 떨어져 있다는 점이 조금 찜찜했다.\n"
		            + "혹시 상한 음식일까? 아니면 누군가의 미끼일까?\n"
		            + "\n"
		            + "나는 잠시 고민했다. 이걸 먹어야 할까?\n"
		            + "아니면 그냥 지나쳐야 할까?");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 햄버거를 먹는다.");
		    System.out.println("[2] : 그냥 지나친다.");
		    System.out.println("[3] : 햄버거를 자세히 살펴본다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("햄버거를 먹었더니 속이 이상하다..."
		    		+ "\n상한 음식이었던 것 같다..."
		    		+ "\n(체력 -1)");
		    stat.minusHp();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("그냥 지나쳤다. 안전이 최우선이다.");
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("햄버거를 살펴보니, 안에 작은 추적 장치가 있었다!\n"
		            + "누군가의 미끼였다. 다행히 함정에 빠지지 않았다.\n(멘탈 +1)");
		    stat.plusMental();
		}
}
