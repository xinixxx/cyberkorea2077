package gameSystem.play.data;

public class PlayerInfoDTO {
	
	private static PlayerInfoDTO statusDTOinstance;

	private final int MAX_STAT = 3;
	private final int MIN_STAT = 0;
	
	// status
	private int hp = 2;
	private int mental = 2;
	private int money = 2;
	private int ending = 0;
	
	// herigate
	private String id = null;
	private int playcnt = 0;
	private int achievement1 = 0; // Story1 엔딩 도달
	private int achievement2 = 0; // Story1 히든 엔딩 도달

	// private 생성자로 외부에서의 객체 생성 불가
	private PlayerInfoDTO() {
	}
	
	// 싱글톤 패턴. 생성되어 있는 싱글톤 인스턴스를 가져오기
	public static PlayerInfoDTO getInstance() {
        if (statusDTOinstance == null) {
        	statusDTOinstance = new PlayerInfoDTO();
        }
        return statusDTOinstance;
    }
	
	// 초기 상태로 초기화하는 메서드
	public void resetStatus() {
        this.hp = 2;
        this.mental = 2;
        this.money = 2;
        this.ending = 0;
    }
	
	public void resetHerigate() {
		this.playcnt = 0;
		this.achievement1 = 0;
		this.achievement2 = 0;
	}
	
	// Hp, Mental, Money 증감 메서드
	public void minusHp() {
		if (hp <= MIN_STAT) {
			this.hp = MIN_STAT;
		} else {
			this.hp--;
		}
	}
	
	public void plusHp() {
		if(hp >= MAX_STAT) {
			this.hp = MAX_STAT;
		} else {
			this.hp++;
		}
	}
	
	public void minusMental() {
		if (mental <= MIN_STAT) {
			this.mental = MIN_STAT;
		} else {
			this.mental--;
		}
	}
	
	public void plusMental() {
		if(mental >= MAX_STAT) {
			this.mental = MAX_STAT;
		} else {
			this.mental++;
		}
	}
	
	public void minusMoney() {
		if (money <= MIN_STAT) {
			this.money = MIN_STAT;
		} else {
			this.money--;
		}
	}
	
	public void plusMoney() {
		if(money >= MAX_STAT) {
			this.money = MAX_STAT;
		} else {
			this.money++;
		}
	}
	
	public void plusPlayCnt() {
		this.playcnt++;
	}
	
	
	// getter & setter

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp > MAX_STAT) {
			this.hp = MAX_STAT;
		} else if (hp < MIN_STAT) {
			this.hp = MIN_STAT;
		} else {
			this.hp = hp;
		}
	}
	
	public int getMental() {
		return this.mental;
	}

	public void setMental(int mental) {
		if (mental > MAX_STAT) {
			this.mental = MAX_STAT;
		} else if (mental < MIN_STAT) {
			this.mental = MIN_STAT;
		} else {
			this.mental = mental;
		}
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money > MAX_STAT) {
			this.money = MAX_STAT;
		} else if (money < MIN_STAT) {
			this.money = MIN_STAT;
		} else {
			this.money = money;
		}
	}

	public int getEnding() {
		return this.ending;
	}

	public void setEnding(int ending) {
		this.ending = ending;
	}

	public int getPlaycnt() {
		return playcnt;
	}

	public void setPlaycnt(int playcnt) {
		this.playcnt = playcnt;
	}

	public int getAchievement1() {
		return achievement1;
	}

	public void setAchievement1(int achievement1) {
		this.achievement1 = achievement1;
	}

	public int getAchievement2() {
		return achievement2;
	}

	public void setAchievement2(int achievement2) {
		this.achievement2 = achievement2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
