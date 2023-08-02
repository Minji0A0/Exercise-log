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
		System.out.println("DAO selectOneStudent() arg:" +studentNo);
		StudentVo result = null;
		String query = "select s.*\r\n"
				+ ",(select department_name from tb_department where department_no=s.department_no) department_name\r\n"
				+ "from tb_student s where student_no= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			:8090은 HTTP , :1521은 PROCESS
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:8090:xe", "kh","kh");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","kh","kh");
//			if(conn==null) {
//				System.out.println("연결실패");
//			}else {
//				System.out.println("연결 성공");
//			}
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, studentNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = new StudentVo();
				result.setAbsenceYn(rset.getString("Absence_Yn"));
				result.setCoachProfessorNo(rset.getString("Coach_Professor_No"));
				result.setDepartmentNo(rset.getString("Department_No"));
				result.setDepartmentName(rset.getString("Department_Name"));
				result.setEntranceDate(rset.getDate("Entrance_Date"));
				result.setStudentAddress(rset.getString("Student_Address"));
				result.setStudentName(rset.getString("Student_Name"));
				result.setStudentNo(rset.getString("Student_No"));
				result.setStudentSsn(rset.getString("Student_Ssn"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset!=null) rset.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
 	}
	
	public List<StudentVo> selectListStudent() {
		String query = "select * from tb_student";
		List<StudentVo> result = null;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","kh","kh");
			if(conn != null) {
				System.out.println("DB연결 성공!!!!!");
			}else {
				System.out.println("DB연결 실패");
			}
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
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
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
		
	}
	
	public List<StudentVo> selectListStudent(String searchWord) {
		String query = "select * from tb_student where student_name like ? or student_address like ?";
		List<StudentVo> result = null;
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","kh","kh");
			pstmt = conn.prepareStatement(query);
			searchWord = "%" + searchWord + "%" ;
			pstmt.setString(1,searchWord);
			pstmt.setString(2,searchWord);
			rs = pstmt.executeQuery();
			result = new ArrayList<StudentVo>();
			
			while(rs.next() == true) {
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
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
		return result;
		
	}
}
