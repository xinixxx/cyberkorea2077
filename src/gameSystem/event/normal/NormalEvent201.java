package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent201 extends Event {
	

	@Override
	public void viewText() {
		  System.out.println("길을 걷던 중, 저 앞에 모자를 쓴 사람이 보였다.\n"
		            + "그는 고개를 숙이고 천천히 걸으며 주변을 살피고 있었다.\n"
		            + "\n"
		            + "나는 그의 행동이 어딘가 이상하다는 것을 느꼈다.\n"
		            + "그의 손은 주머니 속에 깊이 들어가 있었다.\n"
		            + "\n"
		            + "혹시 무기를 숨기고 있는 건 아닐까?\n"
		            + "나는 잠시 멈춰 섰다. 이 사람은 누구일까?\n"
		            + "\n"
		            + "그를 피해야 할까? 아니면 그의 정체를 확인해야 할까?\n"
		            + "그가 나를 향해 한 발짝 다가서는 순간, 긴장감이 최고조에 달했다.");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 피해서 지나간다.");
		    System.out.println("[2] : 수상해 보이니 습격한다.");
		    System.out.println("[3] : 다른 길로 돌아간다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("수상한 사람이 갑자기 공격하며 피해를 입었다.\n(체력 -1)");
		    stat.minusHp();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
		    System.out.println("수상한 사람의 정체는 간첩이었다. 습격에 성공했다!\n(붕대 +1)");
		    inven.setItem1(1);
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("다른 길로 돌아갔고, 아무 일도 일어나지 않았다.");
		}
}
