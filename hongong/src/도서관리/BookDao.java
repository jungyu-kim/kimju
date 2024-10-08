package 도서관리;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDao extends DAO{
	
	
	//3. insert 메소드
		public int insert(Book book) {
			getOpen();
							
				// 데이터 추가
				String sql = "" + 
							"insert into book(title,writer,price,bnum) " +
							"values(?, ?, ?, ?)";
				PreparedStatement pstmt;
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, book.getTitle());
					pstmt.setString(2, book.getWriter());
					pstmt.setInt(3, book.getPrice());
					pstmt.setString(4, book.getBnum());
					
					// sql문장 실행
					int rows = pstmt.executeUpdate();									
					return rows;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				getClose();
				return 0;
		}
		
	//4. select : 조건에 따른 검색(책제목) 메소드
		public void select(String title) {
			getOpen();
			String sql = "select * from book " + "where title=?"; 
			
		try {
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"title");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Book bk = new Book(rs.getString(1), rs.getString(2), rs.getInt(3), sql);
				System.out.println(bk);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		}
		
	//5. select : 목록전체 조회 메소드
		public List<Book> selectAll(){
			getOpen();
			String sql = "select * from book";
			PreparedStatement psmt;
			
			try {
				PreparedStatement pstmt;
				pstmt = conn.prepareStatement(sql);				
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Book bk = new Book(rs.getString(1), rs.getString(2), rs.getInt(3), sql);
					System.out.println(bk);
				}
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			
			return null;
		}
	//6. delete 메소드 (북번호 이용)
		public int delete(String title2) {
			getOpen();
			String sql = "delete from book" + "where title=?";
			try {
				PreparedStatement pstmt;
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,"title2");
				int rs = pstmt.executeUpdate();
				return rs;
				
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			return 0;
			
		}
	//7. update 메소드 (책제목의 가격과 책번호 수정)
			public int update(String title3, int prcie1, String bnum1) {
				getOpen();
				String sql = " " + "update book" + "set price=?, bnum=?" +"where=?";
				try {
					PreparedStatement pstmt;
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1,"price1");
					pstmt.setString(1,"bnum1");
					pstmt.setString(1,"title3");
					int rs = pstmt.executeUpdate();
					return rs;
					
				} catch (SQLException e) {			
					e.printStackTrace();
				}finally {
					getClose();
				}
				return prcie1;
			}
		}//end class
