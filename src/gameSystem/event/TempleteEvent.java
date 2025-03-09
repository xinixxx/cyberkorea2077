package gameSystem.event;

public class TempleteEvent extends Event {

	public TempleteEvent() {
		this.eventId = 000;
	}
	
	@Override
	public void viewText() {
		System.out.println("이벤트 텍스트 출력");
	}

	@Override
	public void viewChoice() {
		System.out.println("[1] : 선택지1번");
		System.out.println("[2] : 선택지2번");
		System.out.println("[3] : 선택지3번");
	}

	@Override
	public void result1() {
		System.out.println("1번 선택지 결과");
		
	}
	
	@Override
	public void result2() {
		System.out.println("2번 선택지 결과");
	}
	
	@Override
	public void result3() {
		System.out.println("3번 선택지 결과");
	}
	

}
