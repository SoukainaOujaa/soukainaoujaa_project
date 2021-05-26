package Biblio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Biblio.model.Book;

public class RetrieveBooksDao {
	
	public boolean RetrieveBooks ()throws ClassNotFoundException, SQLException {
		 boolean status = false;
		 Book book = new Book() ;
		Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
        	.getConnection("jdbc:mysql://127.0.0.1:3306/biblio?serverTimezone=UTC", "root", "soukaina");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select title,author,category from book ")) 
        {
        	 
	         preparedStatement.setString(1, book.getTitle());
	         preparedStatement.setString(2, book.getAuthor());
	         preparedStatement.setString(3, book.getCategory());
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
            
        }
        return status;
	}
}
