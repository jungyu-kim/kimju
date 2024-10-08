package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Employee emp = null;
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;

	public void getOpen() {

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn =     DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.0.9:1521:xe",
                    "java", 
                    "1234");

            System.out.println("연결성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. 연결끊기 메소드(void)
    public void getClose() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("연결끊음");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
	public void insert(String memNum, String memName, String phone, String hdate, int price) {
		String sql = "insert into tbl_number values (?,?,?,?,?) ";
						
		
		 getOpen();
		    try {
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setString(1, memNum);
		        pstmt.setString(2, memName);
		        pstmt.setString(3, phone);
		        pstmt.setString(4, hdate);
		        pstmt.setInt(5, price);

		        int rows = pstmt.executeUpdate();

		        if (rows > 0) {
		            System.out.println(rows + "개의 행이 삽입되었습니다.");
		        }else {
		        	System.out.println("삽입실패");		        	
		        }

		    
		    } catch (SQLIntegrityConstraintViolationException e) {
		    	System.out.println("중복된 값이 있습니다.");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        
		        
		    	getClose();
		        }
	}

	public int update(String empNum, int salary) {
		String sql = "update tbl_number "
					+ "set price = ? "
					+ "where member_number = ?";
		int rows = 0;
		getOpen();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			pstmt.setString(2, empNum);
			rows = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
		}				
		return rows;
	}

	public int delete(String empNum) {
		String sql = "delete from tbl_number "
					+ "where member_number = ?";
		int rows = 0;
		getOpen();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empNum);
			rows = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
		}
		return rows;
	}
	public void select() {
    	String sql = "select * "
    			+ " from  tbl_number";
    			
    			
    	getOpen();
    	try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("사번\t이름\t전화번호");
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setMemberNum(rs.getString("member_number"));
				emp.setMemberName(rs.getString(2));
				emp.setPhone(rs.getString(3));
				emp.setHdate(rs.getString(4));
				emp.setPrice(rs.getInt(5));
				System.out.printf("%s\t%s\t%s ", emp.getMemberNum(), emp.getMemberName(), emp.getPhone());
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	public List<Employee> select(String hireDate) {
		String sql = "select * "
				+ " from tbl_number "
				+ "where hire_date >= ?";
		List<Employee> r = new ArrayList<>();
		getOpen();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,hireDate);			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setMemberNum(rs.getString("member_number"));
				emp.setMemberName(rs.getString(2));
				emp.setPhone(rs.getString(3));
				emp.setHdate(rs.getString(4));
				emp.setPrice(rs.getInt(5));
				r.add(emp);
			}
			rs.close();
			pstmt.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			getClose();
		}
		
		return r;
		
	}// select 메소드
}//end of EmpDao
