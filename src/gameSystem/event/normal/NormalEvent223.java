package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent223 extends Event {

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		 System.out.println("길을 걷던 중, \n"
		 		    + "구석에서 쓰레기통을 뒤지는 소녀를 발견했다.\n"
		            + "소녀는 낡은 옷을 입고 있었고,\n"
		            + "얼굴에는 피곤함이 묻어 있었다.\n"
		            + "\n"
		            + "그녀는 쓰레기통 속을 뒤지며 무언가를 찾고 있는 듯했다.\n"
		            + "작은 손이 떨리고 있었고, 표정은 초조해 보였다.\n"
		            + "\n"
		            + "잠시 후, 그녀는 고개를 들더니 나를 바라보았다.\n"
		            + "\"혹시 여기서 반짝이는 동전을 본 적 있나요?\"\n"
		            + "\n"
		            + "나는 멈춰 섰다. 이 상황에서 어떻게 해야 할까?\n"
		            + "도움을 줄 것인가, 아니면 그냥 지나칠 것인가?");
		}

		@Override
		public void viewChoice() {
		    // TODO Auto-generated method stub
		    System.out.println("[1] : 쓰레기통을 함께 뒤져본다.");
		    System.out.println("[2] : 동전 대신 간식을 건넨다.");
		    System.out.println("[3] : 아무 일도 하지 않고 지나간다.");
		}

		@Override
		public void result1() {
		    // TODO Auto-generated method stub
		    System.out.println("소녀는 오래된 동전을 발견하며 기뻐했다."
		    		+ "\n쓰레기통을 열심히 뒤진 보람이 있었다.."
		    		+ "\n(멘탈 +1)");
		    stat.plusMental();
		}

		@Override
		public void result2() {
		    // TODO Auto-generated method stub
			if(stat.getMoney()>0) {
				System.out.println("소녀는 간식을 받고 감사를 표했다."
						+ "\n(돈 -1, 멘탈 +1)");
			}
		    stat.minusMoney();
		    stat.plusMental();
		}

		@Override
		public void result3() {
		    // TODO Auto-generated method stub
		    System.out.println("소녀는 여전히 쓰레기통 속을 뒤지고 있었다.");
		}
}
