package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent202 extends Event {

	@Override
	public void viewText() {
		 System.out.println("길을 걷던 중, 오래 전에 문을 닫은 편의점을 발견했다.\n"
		            + "유리창은 먼지로 뒤덮여 있었고, 내부는 어두웠다.\n"
		            + "\n"
		            + "편의점 간판은 낡아 글씨를 알아보기 힘들었다.\n"
		            + "문 앞에는 오랫동안 사람의 발길이 닿지 않은 흔적이 보였다.\n"
		            + "\n"
		            + "주변은 고요했고, 공기마저 무겁게 느껴졌다.\n"
		            + "안에 아직 쓸 만한 식량이 남아 있을지도 모른다.\n"
		            + "\n"
		            + "하지만 위험한 무언가가 숨어 있을 가능성도 배제할 수 없었다.\n"
		            + "이제 선택의 시간이 다가왔다.");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 편의점 안으로 들어가 식량을 찾아본다.");
		    System.out.println("[2] : 편의점 주변을 살펴본다.");
		    System.out.println("[3] : 아무 일도 하지 않고 지나간다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("편의점 안에서 유통기한이 남아 있는 식량을 발견했다.\n(체력 +1)");
		    stat.plusHp();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("편의점 근처에서 들개 떼를 만나 체력을 소모했다.\n(체력 -1)");
		    stat.minusHp();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("그냥 지나쳤다. 아무 일도 일어나지 않았다.");
		}
}