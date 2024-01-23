

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import authentication.*;


public class login_check extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login_email=request.getParameter("email");
		String login_pass=request.getParameter("password");
		
		DataBaseDao dao = new DataBaseDao();
		if(dao.login(login_email, login_pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("loginEmail", login_email);
			session.setAttribute("loginPassword", login_pass);
			
			response.sendRedirect("welcome.jsp");
			
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
