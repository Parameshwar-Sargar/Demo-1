package Com.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class selectServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("ID"));
		DatabaseLogics dl = new DatabaseLogics();
		student st = dl.selectdata(id);
		req.setAttribute("Student", st);

		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);

         
	}

}
