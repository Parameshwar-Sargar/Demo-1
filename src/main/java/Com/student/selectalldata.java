package Com.student;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class selectalldata extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		DatabaseLogics dl = new DatabaseLogics();
		List<student> list = dl.selectAlldata();
		
		
		
		req.setAttribute("Students", list);

		RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
		rd.forward(req, resp);

}
}
