package JavaDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertMain {

	public static void main(String[] args) {
		// 데이터 추가
		Connection conn = null;
		try {
			// jdbc 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"java", 
					"1234"
					);
			// 데이터 추가
			String sql = "" + 
						"insert into board (bno,btitle,bcontent,bwriter,bdate) " +
						"values(seq_bno.nextVal, ?, ?, ?, sysdate)";
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "bno", "btitle" });
			pstmt.setString(1, "눈오는밤");
			pstmt.setString(2, "눈이 펑펑 내려요....");
			pstmt.setString(3, "snow");

			// sql문장 실행
			int rows = pstmt.executeUpdate();
			if (rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					int bno = rs.getInt(1); // 1 : 컬럼번호
					String title = rs.getString(2);
					System.out.println("저장된 번호 : " + bno + " " + title);
				}
				System.out.println("추가 성공");
				rs.close();
			} else {
				System.out.println("추가 실패");
			}

			pstmt.close();

			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
