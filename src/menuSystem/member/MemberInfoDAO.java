package menuSystem.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberInfoDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	public Connection getConn() {
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

	public void getClose() {
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

	public int join(MemberInfoDTO memberDto) {
		int row = 0;

		try {
			conn = getConn();

			if (checkId(memberDto)) {
				System.out.println("중복된 아이디가 존재합니다.");
				return -1;
			}
			String sql = "INSERT INTO MEMBERINFO VALUES(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, memberDto.getId());
			psmt.setString(2, memberDto.getPw());
			psmt.setString(3, memberDto.getName());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	public boolean checkId(MemberInfoDTO dto) {
		String sql = "SELECT * FROM MEMBERINFO WHERE ID = ? ";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean login(MemberInfoDTO memberDto) {

		boolean log = false;

		try {
			getConn();

			String sql = "SELECT ID, NAME FROM MEMBERINFO WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, memberDto.getId());
			psmt.setString(2, memberDto.getPw());

			rs = psmt.executeQuery();
			log = rs.next();
//			if (rs.next()) {
//				String resultId = rs.getString("id");
//				String resultName = rs.getString("name");
//				memberDto = new MemberInfoDTO(resultId, resultName);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return log;
	}

}
