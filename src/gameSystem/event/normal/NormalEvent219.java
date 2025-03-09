package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent219 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("어두운 골목길을 지나던 중,\n"
				+ "멀리서 엔진 소리가 들려왔다...\n"
	            + "소리는 점점 가까워지더니 내 앞에서 멈췄다.\n"
	            + "\n"
	            + "폭주족 몇 명이 오토바이에서 내리며 나를 둘러쌌다.\n"
	            + "그들의 눈빛은 날카롭고, 비웃음이 서려 있었다.\n"
	            + "\n"
	            + "이 골목은 우리 구역이다. 통행료를 내라.\n"
	            + "리더가 말했다.\n"
	            + "\n"
	            + "도망칠 길은 없어 보였다.\n"
	            + "긴장감이 온몸을 휘감았다.");
	}


		@Override
		public void viewChoice() {
		    System.out.println("[1] : 폭주족과 협상하여 상황을 해결한다.");
		    System.out.println("[2] : 싸움을 걸어 그들을 제압한다. (근력 필요)");
		    System.out.println("[3] : 적의 수가 너무 많다. 무기를 꺼내자. (권총 필요)");
		}

		@Override
		public void result1() {
			System.out.println("침착하게 협상을 시도했다..."
					+ "\n하지만 폭주족들은 말이 통하는 상대가 아니었다.");
			if(stat.getMoney()>0) {
				System.out.println("어쩔 수 없이 통행료를 지불하고 지나갔다.\n(돈 -1)");
				stat.minusMoney();
			} else {
				System.out.println("통행료로 지불할 돈이 없었기 때문에 싸울 수 밖에 없었다."
						+ "\n적의 수가 너무 많아서, 부상을 입고 겨우 탈출할 수 있었다."
						+ "\n(체력 -2)");
			    stat.minusHp();
			    stat.minusHp();

			}
		}

		@Override
		public void result2() {
			if(inven.getGadget1()==1) {
				System.out.println("나는 성큼성큼 걸어가서 가장 앞에 있던 녀석의 허리를 접어버렸다."
						+ "\n\"더 덤빌 사람 있나?\""
						+ "\n나머지 폭주족은 눈치를 보더니 슬금슬금 길을 열어주었다.");
			} else {
				System.out.println("싸움을 걸었지만, 숫자가 너무 많았다...\n"
						+ "결국 부상을 입고 겨우 탈출했다.\n(체력 -2)");
				stat.minusHp();
				stat.minusHp();
			}
		}

		@Override
		public void result3() {
			if(inven.getItem3()==1) {
				System.out.println("권총을 꺼내 적에게 겨누었고, 그들이 긴장한 순간을 노려 도망쳤다...\n"
		            + "간신히 빠져나왔지만, 긴장감은 여전히 남아 있다.");
			} else {
				System.out.println("품을 뒤져봤지만 무기는 없었기 때문에, 몸으로 싸울 수 밖에 없었다."
						+ "\n적의 수가 너무 많아서, 부상을 입고 겨우 탈출할 수 있었다."
						+ "\n(체력 -2)");
			    stat.minusHp();
			    stat.minusHp();
			}
		}
}