package loginpage;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Basiclogin extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("Username");
		String pass=request.getParameter("Userpass");
		
		if(user.equals("soumya")&&pass.equals("1234"))
		{
			out.println("Login successfull.");
		}
		else
		{
			out.println("Login failed.");
		}
		out.close();
	}

}
