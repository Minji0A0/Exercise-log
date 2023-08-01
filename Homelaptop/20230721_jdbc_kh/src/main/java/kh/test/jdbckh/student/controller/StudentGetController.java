package kh.test.jdbckh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jdbckh.student.model.dao.StudentDao;
import kh.test.jdbckh.student.model.vo.StudentVo;

@WebServlet("/student/get")
public class StudentGetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentGetController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentNo = request.getParameter("sno");
		System.out.println(studentNo);
		
		StudentDao dao = new StudentDao();
		StudentVo vo = dao.selectOneStudent(studentNo);
		request.getRequestDispatcher("/WEB-INF/view/student/get.jsp").forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
