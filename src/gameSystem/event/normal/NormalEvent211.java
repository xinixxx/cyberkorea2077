package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent211 extends Event{

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("어두운 골목 끝에서 낡은 건물을 발견했다.\n"
	            + "간첩의 안전가옥이라는 첩보를 들은 곳이었다.\n"
	            + "\n"
	            + "문을 열고 들어가자,\n"
	            + "내부는 예상보다 조용했다.\n"
	            + "하지만 어딘가에 중요한 단서가 숨겨져 있을 것이다.\n"
	            + "\n"
	            + "책장에는 먼지가 쌓여 있었고,\n"
	            + "냉장고는 반쯤 열려 있었다.\n"
	            + "옷장은 잠겨 있었지만,\n"
	            + "열 수 있을 것 같았다.\n"
	            + "\n"
	            + "나는 숨을 고르며 주변을 살폈다.\n"
	            + "이곳에 무언가 중요한 것이 있을지도 모른다.");
	}

	@Override
	public void viewChoice() {
	    System.out.println("[1] : 책장을 뒤진다.");
	    System.out.println("[2] : 냉장고를 뒤진다.");
	    System.out.println("[3] : 옷장을 뒤진다.");
	}

	@Override
	public void result1() {
		if(inven.getItem2()==1) {
			System.out.println("잠겨있던 서랍을 열쇠를 사용해 열었다."
					+ "\n간첩이 숨겨놓은 돈과 권총 한 자루를 얻었다.\n(돈 +1, 권총 +1)");
		    stat.plusMoney();
		    inven.setGadget3(1);
			
		} else {
			System.out.println("책장 틈새에 숨겨져 있던 돈을 발견했다.\n(돈 +1)");
			stat.plusMoney();
		}
	}

	@Override
	public void result2() {
	    System.out.println("아무것도 찾지 못했다.");
	}

	@Override
	public void result3() {
	    System.out.println("옷장에 걸려있던 옷의 주머니에서 꾸깃꾸깃한 지폐를 발견했다.\n(돈 +1)");
	    stat.plusMoney();
	}

}
