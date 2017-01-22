package javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException,IOException{
		  
		  PrintWriter pw = response.getWriter();
		  response.setContentType("text/html");
		  
		  String login = request.getParameter("userName");
		  String password = request.getParameter("userPassword");
		  
		  if(login.equals("user") && password.equals("user")){
			  pw.println("Authorization Successful!");
		  }
		  else {
			  pw.print("Authorization Failed! Incorrect Login or Password");
		  }
		  pw.close();
	  }
	
}
