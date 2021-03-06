import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class JoinDialogDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int result;
	private boolean next;

	public JoinDialogDAO() {
		// DB 접속
		String url = "jdbc:mysql://192.168.0.23:3306/account_book";
		String user = "root";
		String password = "123456";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int createUser(String m_ID, String m_pass, String m_name, String m_birth, String m_sex) {
		try {
			String sql = "insert into Member_info value(0, ?, ?, ?, ?, ?, curdate(), 0, 0, 0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m_ID);
			pstmt.setString(2, m_pass);
			pstmt.setString(3, m_name);
			pstmt.setString(4, m_birth.toString());
			pstmt.setString(5, m_sex);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
		}  finally {
			if (rs != null) { try { rs.close(); } catch (SQLException e) { } }
			if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { } }
			if (conn != null) { try { conn.close(); } catch (SQLException e) { } }
		}
		return result;
	}
}
