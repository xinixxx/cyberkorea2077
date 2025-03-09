package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent110 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 10 / 20]\n"
				+"결국 정부 내부도 찬반의 의견이 심화되어 결국 분열되었고 대한민국의 주권은 위협받기 시작했다."
				+ "\n그 와중 정보원으로부터 일부 분열된 정치인들이 사성으로 간다는 소식을 접하게 되었다.");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 정치인을 감청한다");
		System.out.println("[2] : 정보원에게 이야기를 더 들어본다");
		System.out.println("[3] : 다크웹에서 정보를 찾아본다");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("사성에 도착한 정치인은 사성의 고위 간부와의 대화에서 충격적인 발언을 하였다. "
				+ "\n[정치인] 드디어 정부를 분열....이제..맡긴거 줘야지?"
				+ "\n[\"사성\" 간부] 약속한 다이아몬드는 여기 있어.. 앞으로도..좋은..비즈니스..파트너..");
	}

	@Override
	public void result2() {
		// TODO Auto-generated method stub
		System.out.println("정치인이 사성에게 뒷돈받고 있다는 사실을 들었지만"
				+ "\n 이렇게 까지 많은 수의 정치인이 사성과 결탁하고 있었다는건 몰랐다."
				+ "\n 사실상 믿을 수 있는건 대통령밖에 없었다.");
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		System.out.println("최근에 밀수품들이 정치인들의 집으로 간다는 찌라시가 있었다."
				+ "\n 실제로 밀수품은 정치인들의 집으로 가고 있었고"
				+ "\n 그 밀수품은 사성에서 뇌물로 준것을 알게 되었다.");
	}

}
