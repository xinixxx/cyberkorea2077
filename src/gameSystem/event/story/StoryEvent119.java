package gameSystem.event.story;

import gameSystem.event.Event;

public class StoryEvent119 extends Event{

	@Override
	public void viewText() {
		// TODO Auto-generated method stub
		System.out.println("[메인 스토리 19 / 20]\n"
				+"통제실을 들어간 나는 그곳에서 발사 준비중인 천둥의 창과"
				+ "\n발사하려는 \"사성\" 최고간부를 보게 되었다");
	}

	@Override
	public void viewChoice() {
		// TODO Auto-generated method stub
		System.out.println("[1] : 눈치채지 못하게 발소리를 죽이고 숨어든다");
		System.out.println("[2] : 총으로 컴퓨터를 쏴서 시스템을 무력화한다 (권총 필요)");
		System.out.println("[3] : 육탄전으로 저지 후 컴퓨터를 무력화한다 (근력 필요)");
	}

	@Override
	public void result1() {
		// TODO Auto-generated method stub
		System.out.println("숨소리조차 죽인채 통제실 내부로 살금살금 들어갔다."
				+ "\n하지만 최고간부의 결심은 내 발걸음보다 빨랐다."
				+ "\n최고간부가 버튼에 손을 올리려는 순간 빠르게 뛰었지만,"
				+ "\n천둥의 창이 발사되는 걸 막을 수는 없었다."
				+ "\n"
				+ "\n"
				+ "\n천둥의 창이 발사된 후, 북한의 잔당들은 대대적인 반격을 감행했다."
				+ "\n위태로웠던 대한민국 정부는 잔당을 막아내는 것만으로도 벅찼고,"
				+ "\n그 틈을 타 \"사성\"은 국내에서의 영향력을 강화했다."
				+ "\n대한민국 정부는 사실상 사성기업의 하수인으로 전락했고,"
				+ "\n나를 포함해 사성기업에 반기를 들었던 자들은 쫓기는 신세가 되었다."
				+ "\n"
				+ "\n [Bad Ending : 파멸]");
		stat.setEnding(1);
		stat.setAchievement1(1);
	}

	@Override
	public void result2() {
		if (inven.getGadget3() == 1) {
			System.out.println("시스템은 생각보다 정교하지 않았던 것 같다."
					+ "\n 컴퓨터가 무력화되니 천둥의 창 시스템은 자동으로 꺼졌고"
					+ "\n 모든걸 잃은 사성 최고간부는 망연자실해 하였다.");
		} else {
			System.out.println("허둥지둥 주머니를 뒤졌지만 권총이 나오는 일은 없었다."
					+ "\n내가 당황한 사이 사성그룹의 간부는 발사버튼을 누르고 말았다."
					+ "\n천둥의 창은 발사되었고, 난 망연자실한 채 자리에 주저앉고 말았다."
					+ "\n"
					+ "\n"
					+ "\n천둥의 창이 발사된 후, 북한의 잔당들은 대대적인 반격을 감행했다."
					+ "\n위태로웠던 대한민국 정부는 잔당을 막아내는 것만으로도 벅찼고,"
					+ "\n그 틈을 타 \"사성\"은 국내에서의 영향력을 강화했다."
					+ "\n대한민국 정부는 사실상 사성기업의 하수인으로 전락했고,"
					+ "\n나를 포함해 사성기업에 반기를 들었던 자들은 쫓기는 신세가 되었다."
					+ "\n"
					+ "[Bad Ending : 파멸]");
			stat.setEnding(1);
			stat.setAchievement1(1);
		}
		
	}

	@Override
	public void result3() {
		// TODO Auto-generated method stub
		if (inven.getGadget1() == 1) {
			System.out.println("사성 최고간부도 나름 육탄전에 자신이 있었지만 내 앞에선 무리였다."
					+ "\n갈고 닦은 내 근력에 최고간부는 제압당했으며 더 이상 날 막을 수 없었다."
					+ "\n시스템은 아직 동작하고 있었으나 이러한 시스템을 무력화 시키기엔 3초면 충분했다.");
		} else {
			System.out.println("사성에서 최고간부까지 올라온 이유가 있었던 것 같다."
					+ "\n나도 나름 육탄전에 자신이 있었지만, 최고간부에게는 미치지 못했다."
					+ "\n턱을 맞고 쓰러진 내 눈에 마지막으로 비친 모습은"
					+ "\n피투성이가 된 손으로 천둥의 창 발사버튼을 누르는 최고간부의 모습이었다."
					+ "\n"
					+ "\n"
					+ "\n천둥의 창이 발사된 후, 북한의 잔당들은 대대적인 반격을 감행했다."
					+ "\n위태로웠던 대한민국 정부는 잔당을 막아내는 것만으로도 벅찼고,"
					+ "\n그 틈을 타 \"사성\"은 국내에서의 영향력을 강화했다."
					+ "\n대한민국 정부는 사실상 사성기업의 하수인으로 전락했고,"
					+ "\n나를 포함해 사성기업에 반기를 들었던 자들은 쫓기는 신세가 되었다."
					+ "\n"
					+ "\n[Bad Ening : 파멸]");
			stat.setEnding(1);
			stat.setAchievement1(1);
		}
	}

}
