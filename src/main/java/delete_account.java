

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import authentication.DataBaseDao;


public class delete_account extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseDao dao = new DataBaseDao();
	    
		HttpSession session = request.getSession();
		String delete_email = (String)session.getAttribute("loginEmail");
		if(dao.delete(delete_email)) {
			session.removeAttribute("loginEmail");
			session.removeAttribute("loginPassword");
			response.sendRedirect("registration.jsp");
		}else {
		
		}
		
		
	}

}
