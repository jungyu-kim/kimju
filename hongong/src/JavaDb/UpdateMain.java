package JavaDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMain {

	public static void main(String[] args) {
		// 연결하기, ctrl + d(한 줄 지우기)
		Connection conn = null;

		try {
			// jdbc 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection(
					"jdbc:Oracle:thin:@localhost:1521:xe", // url
					"java", // 계정
					"1234" // 비밀번호
			);
			// 데이터 수정
			String sql = "" + "update board " + "set btitle=?, bcontent=? " + "where bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno","btitle"});
			pstmt.setString(1, "배가");
			pstmt.setString(2, "고파요");
			pstmt.setInt(3, 5);

			int rows = pstmt.executeUpdate();
			System.out.println("수정된 갯수 : " + rows);

			pstmt.close();
			
			// sql문장 실행
//			int rows = pstmt.executeUpdate();
//			if (rows == 1) {
//				ResultSet rs = pstmt.getGeneratedKeys();
//				if (rs.next()) {
//					int bno = rs.getInt(1); // 1 : 컬럼번호
//					String title = rs.getString(1);
//					String content = rs.getString(3);
//					
//					System.out.printf("수정된 내용 : %s : %s ", title, content );
//				}
//			}
			
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
