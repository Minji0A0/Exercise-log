package kh.test.jdbckh.student.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import kh.test.jdbckh.student.model.vo.StudentVo;
import static kh.test.jdbckh.common.jdbc.JdbcTemplate.*;



public class StudentDao {
	
	public StudentVo selectOneStudent(Connection conn, String studentNo) {
		System.out.println("DAO selectOneStudent() arg:" +studentNo);
		StudentVo result = null;
		String query = "select s.*\r\n"
				+ ",(select department_name from tb_department where department_no=s.department_no) department_name\r\n"
				+ "from tb_student s where student_no= ?";
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
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

	public List<StudentVo> selectListStudent(String searchWord){
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
	
	public List<StudentVo> selectListStudent(Connection conn){
		List<StudentVo> result = null ;
		//TODO
		
		return result;
	}

	public List<StudentVo> selectListStudent(Connection conn, int currentPage, int pageSize, int totalCnt){
		List<StudentVo> result = new ArrayList<StudentVo>();
		String query="select * from (select tb1.*, rownum rn from (select * from tb_student order by student_no asc) tb1) tb2\r\n"
				+ " where rn between ? and ?";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int startRownum = 0;
		int endRownum = 0;
		
		//test**
		System.out.println("currentPage : " + currentPage);
		System.out.println("pageSize : "+ pageSize);
		System.out.println("총글개수 : "+ totalCnt);
		//test**
		
		startRownum = (currentPage-1)*pageSize +1;
		endRownum = ((currentPage*pageSize) > totalCnt) ? totalCnt : (currentPage*pageSize);
		System.out.println("startRownum:" + startRownum);
		System.out.println("endRownum:" + endRownum);
	
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRownum);
			pstmt.setInt(2, endRownum);
			rs = pstmt.executeQuery();
		
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
		}catch (SQLException e) {
		e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
			
		System.out.println(result);
		return result;
	}

	
	
	public int queryTotalCnt() {
	int result = 0;
	String queryTotalCnt = "select count(*) cnt from tb_student";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; 

	try {
		conn = getConnection();
		pstmt = conn.prepareStatement(queryTotalCnt);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			result = rs.getInt("cnt");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		close(rs);
		close(pstmt);
		close(conn);
	}
	System.out.println("총글개수 : "+result);
	return result;
	
	}
	
	public int getCount(Connection conn) {
		int result = 0 ;
		String queryTotalCnt = "select count(*) cnt from tb_student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int totalCnt = 0;
		try {
			pstmt = conn.prepareStatement(queryTotalCnt);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalCnt = rs.getInt("cnt");
			}
			System.out.println("a 총글개수 : " + totalCnt);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}System.out.println("b 총글개수 : "+totalCnt);
		return totalCnt;
	}
	
	public int insertStudent(Connection conn, StudentVo vo) {
		int result = 0 ;
		//TODO
		return result;
	}
	
	public List<StudentVo> selectListStudent(Connection conn, String searchWord){
		List<StudentVo> result = null;
		return result;
	}
	
	public int getTotalCount(Connection conn) {
		int result = 0;
		//TODO
		return result;
	}
	
	public int getSearchTotalCount(Connection conn, String searchWord) {
		int result = 0;
		//TODO
		return result;
	}
	
	public Map<String, Object> selectListStudent(int currentPage, int pageSize){
		Map<String, Object> result = null;
		//TODO
		return result;
	}

}