package kh.test.jdbckh.student.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kh.test.jdbckh.student.model.vo.StudentVo;



public class StudentDao {
	
	public StudentVo selectOneStudent(String studentNo) {
		System.out.println("DAO selectOneStudent() arg:" + studentNo);
		
		StudentVo result = null;
		String query = "selet * from tb_student where student_no = " + studentNo;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:8090:xe", "kh","kh");
			if(conn==null) {
				System.out.println("연결실패");
			}else {
				System.out.println("연결 성공");
			}
		}catch (Exception e) {
			
		}finally {

		}
		
		return result;
 	}
	
	public List<StudentVo> selectListStudent() {
		List<StudentVo> result = null;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","kh","kh");
			if(conn != null) {
				System.out.println("DB연결 성공!!!!!");
			}else {
				System.out.println("DB연결 실패");
			}
//			stmt = conn.createStatement();
			String query = "select * from tb_student";
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			result = new ArrayList<StudentVo>();
			
			while(rs.next() == true) {
//				확인용으로 한번 출력후 이상없을경우 삭제 //System.out.println(rs.getString("STUDENT_NAME"));
				StudentVo vo = new StudentVo();
				vo.setStudentNo(rs.getString("student_no"));
				vo.setDepartmentNo(rs.getString("department_no"));
				vo.setStudentName(rs.getString("student_name"));
				vo.setStudentSsn(rs.getString("student_ssn"));
				vo.setStudentAddress(rs.getString("student_address"));
				vo.setEntranceDate(rs.getDate("entrance_date"));
				vo.setAbsenceYn(rs.getString("absence_yn"));
				vo.setCoachProfessorNo(rs.getString("coach_professor_no"));
				
				result.add(vo);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(stmt!=null) {stmt.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
		
	}
}
