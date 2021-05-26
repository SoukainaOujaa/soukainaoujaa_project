package Biblio.controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Biblio.dao.BookDao;
import Biblio.dao.LoginDao;
import Biblio.dao.RetrieveBooksDao;
import Biblio.model.Book;

/**
 * Servlet implementation class RetrieveBooks
 */
@WebServlet("/RetrieveBooks")
public class RetrieveBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RetrieveBooksDao retrievebooksdao;
	Book book;
	 public void init() {
  	   
  	   retrievebooksdao = new RetrieveBooksDao() ;
  	   
     }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/RetrieveBooks.jsp");
		dispatcher.forward(request, response); 
		
		try {
			retrievebooksdao.RetrieveBooks();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
	
}
