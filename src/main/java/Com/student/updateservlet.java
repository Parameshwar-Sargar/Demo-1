package Com.student;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class updateservlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	int id = Integer.parseInt(req.getParameter("iD"));
	String name = req.getParameter("stdName");
	String address = req.getParameter("address");
	String marks = req.getParameter("marks");
	
	
	
	
	DatabaseLogics dl = new DatabaseLogics();
	dl.updaterecoard(name, address, marks, id);
	}

}
