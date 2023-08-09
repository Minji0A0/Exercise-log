package kh.test.jdbckh.department.model.service;

import java.sql.Connection;
import java.util.List;

import kh.test.jdbckh.department.model.dao.DepartmentDao;
import kh.test.jdbckh.department.model.dto.DepartmentDto;

import static kh.test.jdbckh.common.jdbc.JdbcTemplate.*;

public class DepartmentService {
	public DepartmentDao dao = new DepartmentDao();
	
	public List<DepartmentDto> selectList(){
		List<DepartmentDto> result = null;
		Connection conn = getConnection();
		close(conn);
		return result;
	}
	public DepartmentDto selectOne(String departmentNo) {
		DepartmentDto result = null;
		Connection conn = getConnection();
		result = dao.selectOne(conn, departmentNo);
		close(conn);
		return result;
	}
	public int insert(DepartmentDto dto) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn,  dto);
		close(conn);
		return result;
	}
	public int update(DepartmentDto dto) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, dto);
		close(conn);
		return result;
	}
	public int delete(String departmentNo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, departmentNo);
		close(conn);
		return result;
	}
}
