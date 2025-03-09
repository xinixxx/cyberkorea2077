package gameSystem.play.data;

public class InventoryDTO {

	private static InventoryDTO inventoryDTOinstance;
	
	private int item1 = 0; // 붕대
	private int item2 = 0; // 열쇠
	private int item3 = 0;
	private int gadget1 = 0; // 근력
	private int gadget2 = 0;
	private int gadget3 = 0;
	
	private InventoryDTO() {}
	
	public static InventoryDTO getInstance() {
		if (inventoryDTOinstance == null) {
			inventoryDTOinstance = new InventoryDTO();
		}
		return inventoryDTOinstance;
	}
	
	public void resetInventory() {
		this.item1 = 0;
		this.item2 = 0;
		this.item3 = 0;
		this.gadget1 = 0;
		this.gadget2 = 0;
		this.gadget3 = 0;
	}

	// getter & setter
	
	public int getItem1() {
		return item1;
	}

	public void setItem1(int item1) {
		this.item1 = item1;
	}

	public int getItem2() {
		return item2;
	}

	public void setItem2(int item2) {
		this.item2 = item2;
	}

	public int getItem3() {
		return item3;
	}

	public void setItem3(int item3) {
		this.item3 = item3;
	}

	public int getGadget1() {
		return gadget1;
	}

	public void setGadget1(int gadget1) {
		this.gadget1 = gadget1;
	}

	public int getGadget2() {
		return gadget2;
	}

	public void setGadget2(int gadget2) {
		this.gadget2 = gadget2;
	}

	public int getGadget3() {
		return gadget3;
	}

	public void setGadget3(int gadget3) {
		this.gadget3 = gadget3;
	}

	
	
}
