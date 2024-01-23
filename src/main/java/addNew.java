import authentication.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class addNew extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String password=request.getParameter("password");
		String state=request.getParameter("state");
		String team=request.getParameter("team");
		
		DataBaseDao dao = new DataBaseDao();
	   Boolean count = dao.addNew(name, email, phone, team, state, password);
//	   PrintWriter out = response.getWriter();
//	   out.print(count);
		if(count) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			RequestDispatcher rd = request.getRequestDispatcher("added.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("registration.jsp");
		}
		
//		PrintWriter out = response.getWriter();
//		out.println("name: "+name);
//		out.println("Email: "+email);
//		out.println("Phone.no: "+phone);
//		out.println("State: "+state);
//		out.println("Team: "+team);
//		out.println("Password: "+password);
		
	}

}
