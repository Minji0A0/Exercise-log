package kh.test.jdbckh.student.model.service;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static kh.test.jdbckh.common.jdbc.JdbcTemplate.*;
import kh.test.jdbckh.student.model.dao.StudentDao;
import kh.test.jdbckh.student.model.vo.StudentVo;

import java.util.concurrent.ExecutionException;


public class StudentService {
	
	private StudentDao dao = new StudentDao();
	
	public int insertStudent(StudentVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insertStudent(conn,vo);
		close(conn);
		return result;
	}
	
	public StudentVo selectOneStudent(String studentNo) {
		Connection conn = getConnection();
		StudentVo result = dao.selectOneStudent(conn,studentNo);
		close(conn);
		return result;
	}
	public List<StudentVo>selectListStudent(){
		Connection conn = getConnection();
		List<StudentVo> result = dao.selectListStudent(conn);
		close(conn);
		return result;
	}
	public List<StudentVo> selectListStudent(String searchWord){
		Connection conn = getConnection();
		List<StudentVo> result = dao.selectListStudent(conn,searchWord);
		close(conn);
		return result;
	}
	public Map<String, Object> selectListStudent(int currentPage, int pageSize){
		Connection conn = getConnection();
		int totalCnt = dao.getCount(conn);
		System.out.println("service currentPage : " + currentPage);
		System.out.println("service pageSize : "+ pageSize);
		System.out.println("service 총글개수 : "+ totalCnt);
		List<StudentVo> result = dao.selectListStudent(conn,currentPage,pageSize,totalCnt);
		close(conn);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("totalCnt",  totalCnt);
		map.put("studentList", result);
		return map;
	}
	public Map<String, Object> selectListStudent(int currentPage, int pageSize, String searchWord){
		Connection conn = getConnection();
		int totalCnt = dao.getSearchTotalCount(conn, searchWord);
		List<StudentVo> result = dao.selectListStudent(conn,currentPage, pageSize, totalCnt);
		close(conn);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("totalCnt", totalCnt);
		map.put("studentList", result);
		return map;
	}
	public int getTotalCount() {
		Connection conn = getConnection();
		int result = dao.getTotalCount(conn);
		close(conn);
		return result;
	
	}

}
