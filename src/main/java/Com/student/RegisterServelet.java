package Com.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServelet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = null;

//				int stdid = Integer.parseInt(req.getParameter("iD"));
		String stdName = req.getParameter("stdName");
		String stdAddress = req.getParameter("address");
		String stdMarks = req.getParameter("marks");

		DatabaseLogics dl = new DatabaseLogics();

	DatabaseLogics.addrecoard(stdName, stdAddress, stdMarks);
		// DatabaseLogics.addrecoard(stdName, stdAddress, stdMarks);
		Cookie[] ck = req.getCookies();
		if (ck != null) {
			for (Cookie cookie : ck) {
				if ("user".equals(cookie.getName())) {
					username = cookie.getValue();
				}
				

			}
			
			System.out.println( "UserId is "+username);
		}

	}

}
