package menuSystem.main;

public class PlayerInfoDTO {

	private String id;
	private String playCnt;
	private String ac1;
	private String ac2;

	public PlayerInfoDTO() {
	}

	
	// getter & setter
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlayCnt() {
		return playCnt;
	}

	public void setPlayCnt(String playCnt) {
		this.playCnt = playCnt;
	}

	public String getAc1() {
		return ac1;
	}

	public void setAc1(String ac1) {
		this.ac1 = ac1;
	}

	public String getAc2() {
		return ac2;
	}

	public void setAc2(String ac2) {
		this.ac2 = ac2;
	}

}
