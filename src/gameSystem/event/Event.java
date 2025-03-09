package gameSystem.event;

import gameSystem.play.data.InventoryDTO;
import gameSystem.play.data.PlayerInfoDTO;

public abstract class Event {
	
	protected PlayerInfoDTO stat = PlayerInfoDTO.getInstance();
	protected InventoryDTO inven = InventoryDTO.getInstance();
			
	protected int eventId;
	
	public abstract void viewText();
	public abstract void viewChoice();
	public abstract void result1();
	public abstract void result2();
	public abstract void result3();
	
	public int getEventId() {
		return this.eventId;
	}
	
	public void viewChoiceConfig() {
		System.out.println("--------------------------------------");
		System.out.println("[0] : 환경설정(인벤토리)");
		System.out.println("--------------------------------------");
	}
	
	
}
