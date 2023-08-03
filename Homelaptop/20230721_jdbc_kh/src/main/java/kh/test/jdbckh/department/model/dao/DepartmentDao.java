package kh.test.jdbckh.department.model.dao;

import java.sql.Connection;
import java.util.List;

import kh.test.jdbckh.department.model.dto.DepartmentDto;

public class DepartmentDao {
	
	public List<DepartmentDto> selectList(Connection conn){
		List<DepartmentDto> result = null;
		return result;
	}
	public DepartmentDto selectOne(Connection conn, String departmentNo) {
		DepartmentDto result = null;
		return result;
	}
	public int insert(Connection conn, DepartmentDto dto) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, DepartmentDto dto) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String departmentNo) {
		int result = 0;
		return result;
	}
	
	public int getTotalCount(String searchWord) {
		int result = 0;
		return result ; 
	}
	public List<DepartmentDto> selectLIst(Connection conn, int currentPage, int pageSize, String searchWord){
		List<DepartmentDto> result = null;
		return result;
	}
}