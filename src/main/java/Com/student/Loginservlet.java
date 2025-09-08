package Com.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =req.getParameter("id");
		String user = req.getParameter("pwd");
		
		if (id.equals(user)) {
		Cookie ck = new Cookie("user", user);
		resp.addCookie(ck);
		
		req.setAttribute("user", ck);
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.include(req, resp);
		
		}else {
			req.setAttribute("ErrorMassgess", "you are worng ");
			RequestDispatcher rd =req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}
	}

}
