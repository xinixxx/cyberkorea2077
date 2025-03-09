package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent207 extends Event {

	@Override
	public void viewText() {
		 System.out.println("갑작스러운 큰 소리와 함께 들개 무리가 달려왔다.\n"
		            + "그들의 눈빛은 날카롭고, 으르렁거리는 소리가 점점 커졌다.\n"
		            + "\n"
		            + "나는 순간 멈춰 섰다. 심장이 빠르게 뛰기 시작했다.\n"
		            + "이대로 가만히 있다간 위험할 게 분명했다.\n"
		            + "\n"
		            + "주변을 둘러보니, 낡은 자동차가 눈에 들어왔다.\n"
		            + "그 밑으로 숨으면 시간을 벌 수 있을지도 모른다.\n"
		            + "\n"
		            + "하지만 싸운다면 이 상황을 끝낼 수도 있을 것이다.\n"
		            + "문제는 내가 이길 수 있을지 확신이 없다는 것이다.\n"
		            + "\n"
		            + "전속력으로 뛰어 도망칠까? 아니면 싸워볼까?\n");
		}

		@Override
		public void viewChoice() {
		    System.out.println("[1] : 전속력으로 뛰어 도망친다.");
		    System.out.println("[2] : 들개 무리들이랑 싸운다.");
		    System.out.println("[3] : 근처 자동차 밑으로 피신 해본다");
		}

		@Override
		public void result1() {
		    System.out.println("가까스로 들개 무리들로부터 따돌렸다.");
		}

		@Override
		public void result2() {
		    System.out.println("주변에 있는 모든 도구들을 이용하여 들개 무리들을 내쫓는데 성공했다."
		    		+ "\n위험한 상황을 넘기고 나니, 뭔가 무기를 다루는 데에 요령이 생긴 것 같다."
		    		+ "\n(근력+1)");
		    inven.setGadget1(1);
		}

		@Override
		public void result3() {
		    System.out.println("들개들이 비웃기라도 하는 듯 잔뜩 물고 갔다."
		    		+ "\n(체력-1)");
		    stat.minusHp();
		}
}
