package com.project1;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AddServlet extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)
     {
	   String s="Hello world Application using servlet";
	   System.out.println(s);
	   

	      try {
		  res.getWriter().println(s);
	      } catch (IOException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
	      }
	    
     }
}


