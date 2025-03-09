package menuSystem.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import menuSystem.member.MemberInfoDTO;

public class MainDAO {

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

		} catch (Exception e) {
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

	public boolean reset(MemberInfoDTO memberDto) {
		// TODO
		System.out.println("reset");
		return false;
	}

	public boolean delete(MemberInfoDTO memberDto) {
		getConn();
		boolean del = false;
		String sql = "DELETE FROM MEMBERINFO WHERE ID=? AND PW=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, memberDto.getId());
			psmt.setString(2, memberDto.getPw());
			rs = psmt.executeQuery();
			del = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return del;
	}

}
