package gameSystem.event.normal;

import gameSystem.event.Event;

public class NormalEvent210 extends Event {

	@Override
	public void viewText() {
		 System.out.println("갑자기 어떤 아저씨가 나를 멈춰 세웠다.\n"
		            + "그는 웃으며 내게 가위바위보를 하자고 했다.\n"
		            + "\n"
		            + "이 상황은 어딘가 이상했다.\n"
		            + "왜 가위바위보를 하자는 걸까?\n"
		            + "그의 표정은 장난스러워 보였지만, \n"
		            + "뭔가 숨겨진 의도가 느껴졌다.\n"
		            + "\n"
		            + "나는 잠시 멈춰 서서 아저씨를 바라보았다.\n"
		            + "그가 내게 말했다.\n"
		            + "\"이길 자신 있으면 해보라고.\"");
		}

		@Override
		public void viewChoice() {
		    System.out.println("[1] : 가위를 낸다.");
		    System.out.println("[2] : 바위를 낸다.");
		    System.out.println("[3] : 보를 낸다.");
		}

		@Override
		public void result1() {
		    System.out.println("아저씨는 보를 내어 내가 가위바위보를 이겼다.\n"
		            + "내가 이겼다며 지폐를 한 장 건내고 떠나갔다."
		            + "\n(돈 +1)");
		    stat.plusMoney();
		}

		@Override
		public void result2() {
		    System.out.println("아저씨는 보를 내어 내가 가위바위보를 졌다.\n"
		            + "아저씨는 가위바위보를 이겼다며 티배깅을 시전했다\n."
		            + "어줍잖은 아저씨의 춤사위에 괜히 더 열이 받는다.\n(멘탈 -1)");
		    stat.minusMental();
		}

		@Override
		public void result3() {
		    System.out.println("아저씨는 보를 내어 내가 가위바위보를 비겼다.\n"
		            + "아무 일도 일어나지 않았다.");
		}
}
