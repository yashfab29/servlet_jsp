package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import Dao.BookDao;
import bean.Book;


public class Create extends HttpServlet{

	public void init(ServletConfig c) throws ServletException
	{
		super.init(c);
	}
	   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	   {
		   HttpSession session = request.getSession(true);
			PrintWriter out = response.getWriter();
			String btn=request.getParameter("add_book");
			if(session!=null)
		   {
			   String id=request.getParameter("id");  
	        String name=request.getParameter("name");  
	        String author=request.getParameter("author");  
	        String publisher=request.getParameter("publisher");
	        
	        Book b = new Book();
	        b.setId(id);
	        b.setName(name);
	        b.setAuthor(author);
	        b.setPublisher(publisher);
	        //System.out.println(b);  	
	       int status=BookDao.create(b);  
	        if(status>0){  
	            //out.print("<p>Book saved successfully!!!</p>");  
	            response.sendRedirect("success.jsp");  
	        }else{  
	            out.println("Sorry! unable to add book");  
	        }  
	        
	        System.out.println(b);
	        out.close();  
		   }
		   
	   }

	  
	}