package gameSystem.play;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import gameSystem.event.EventDTO;
import gameSystem.play.data.InventoryDTO;
import gameSystem.play.data.PlayerInfoDTO;
import menuSystem.member.MemberInfoDTO;

public class PlayDAO {

	MemberInfoDTO meminfo = new MemberInfoDTO();
	PlayerInfoDTO pinfo = PlayerInfoDTO.getInstance();
	InventoryDTO inven = InventoryDTO.getInstance();
	EventDTO eventinfo = EventDTO.getInstance();

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe";
			String user = "cgi_25k_cloud2_p1_4";
			String password = "smhrd4";

			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("자원 반납 시 문제 발생");
		}
	}

	// DB 테이블에 저장된 데이터 가져오기
	// PlayerInfoDTO : hp, mental, money, playcnt, achievement1, achievement2
	// InventoryDTO : item1, item2, item3, gadget1, gadget2, gadget3
	// EventDTO : currentEventIndex, currentStoryProgress1
	public void getSaveData() { // 세이브 데이터 불러오기

		try {
			getConn();

			String sql1 = "SELECT PLAYCNT, AC1, AC2, HP, MENTAL, MONEY, CUREV, ST1PG FROM PLAYERINFO WHERE ID=?";

			psmt = conn.prepareStatement(sql1);
			psmt.setString(1, pinfo.getId());

			rs = psmt.executeQuery();

			if (rs.next()) {

				int playcnt = rs.getInt("PLAYCNT");
				pinfo.setPlaycnt(playcnt);
				int ac1 = rs.getInt("AC1");
				pinfo.setAchievement1(ac1);
				int ac2 = rs.getInt("AC2");
				pinfo.setAchievement2(ac2);
				int HP = rs.getInt("HP");
				pinfo.setHp(HP);
				int MENTAL = rs.getInt("MENTAL");
				pinfo.setMental(MENTAL);
				int MONEY = rs.getInt("MONEY");
				pinfo.setMoney(MONEY);
				int CUREV = rs.getInt("CUREV");
				eventinfo.setCurrentEventIndex(CUREV);
				int ST1PG = rs.getInt("ST1PG");
				eventinfo.setCurrentStoryProgress1(ST1PG);

			}

			getConn();

			String sql2 = "SELECT ITEM1, ITEM2, ITEM3, ABI1, ABI2, ABI3 FROM INVENTORY WHERE ID=?";

			psmt = conn.prepareStatement(sql2);
			psmt.setString(1, pinfo.getId());

			rs = psmt.executeQuery();

			if (rs.next()) {

				int ITEM1 = rs.getInt("ITEM1");
				inven.setItem1(ITEM1);
				int ITEM2 = rs.getInt("ITEM2");
				inven.setItem2(ITEM2);
				int ITEM3 = rs.getInt("ITEM3");
				inven.setItem3(ITEM3);
				int ABI1 = rs.getInt("ABI1");
				inven.setGadget1(ABI1);
				int ABI2 = rs.getInt("ABI2");
				inven.setGadget2(ABI2);
				int ABI3 = rs.getInt("ABI3");
				inven.setGadget3(ABI3);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

	}

	// 변수에 저장된 데이터를 DB에 업데이트 하기
	public boolean updateSaveData() {
		// 저장하기
		boolean b = false;

		try {
			getConn();

			String sql = "UPDATE PLAYERINFO SET PLAYCNT = ?, AC1 = ?, AC2 = ?, HP = ?, MENTAL = ?, MONEY = ?,CUREV = ?, ST1PG = ?  WHERE ID = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, pinfo.getPlaycnt());
			psmt.setInt(2, pinfo.getAchievement1());
			psmt.setInt(3, pinfo.getAchievement2());
			psmt.setInt(4, pinfo.getHp());
			psmt.setInt(5, pinfo.getMental());
			psmt.setInt(6, pinfo.getMoney());
			psmt.setInt(7, eventinfo.getCurrentEventIndex());
			psmt.setInt(8, eventinfo.getCurrentStoryProgress1());
			psmt.setString(9, pinfo.getId());
			int row1 = psmt.executeUpdate();

			String sql2 = "UPDATE INVENTORY SET ITEM1 = ?, ITEM2 = ?, ITEM3 = ?, ABI1= ?, ABI2 = ?, ABI3 = ? WHERE ID = ?";
//		
			psmt = conn.prepareStatement(sql2);

			psmt.setInt(1, inven.getItem1());
			psmt.setInt(2, inven.getItem2());
			psmt.setInt(3, inven.getItem3());
			psmt.setInt(4, inven.getGadget1());
			psmt.setInt(5, inven.getGadget2());
			psmt.setInt(6, inven.getGadget3());
			psmt.setString(7, pinfo.getId());
			int row2 = psmt.executeUpdate();

			if (row1 > 0 && row2 > 0) {
				b = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return b;
	}

	// DB에 기본 데이터 삽입
	public boolean makeDefaultSaveData(MemberInfoDTO dto) {
		boolean b = false;
		try {
			getConn();

			String sql = "INSERT INTO PLAYERINFO (ID, PLAYCNT, AC1, AC2, HP, MENTAL, MONEY, CUREV, ST1PG) "
					   + "VALUES (?, 0, 0, 0, 2, 2, 2, 0, 0)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			int row1 = psmt.executeUpdate();

			String sql2 = "INSERT INTO INVENTORY (ID, ITEM1, ITEM2, ITEM3, ABI1, ABI2, ABI3) "
					  	+ "VALUES (?, 0, 0, 0, 0, 0, 0)";

			psmt = conn.prepareStatement(sql2);
			psmt.setString(1, dto.getId());
			int row2 = psmt.executeUpdate();

			if (row1 > 0 && row2 > 0) {
				b = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return b;
	}
	
	// DB에 저장된 데이터를 초기화하기
	public boolean resetSaveData() {
		boolean b = false;
		try {
			getConn();
			
			String sql = "UPDATE PLAYERINFO SET PLAYCNT = 0, AC1 = 0, AC2 = 0, HP = 2, MENTAL = 2, MONEY = 2, CUREV = 001, ST1PG = 0  WHERE ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pinfo.getId());
			int row1 = psmt.executeUpdate();
			
			String sql2 = "UPDATE INVENTORY SET ITEM1 = 0, ITEM2 = 0, ITEM3 = 0, ABI1= 0, ABI2 = 0, ABI3 = 0 WHERE ID = ?";
			psmt = conn.prepareStatement(sql2);
			psmt.setString(1, pinfo.getId());
			int row2 = psmt.executeUpdate();
			
			if (row1 > 0 && row2 > 0) {
				b = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return b;
	}
	
}