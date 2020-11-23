import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Connexion {
	
	Connection con = null;
	Statement stm = null;
	ResultSet res = null;
	
	
	public Connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/bookstore" , "root" ,"");
			}catch(ClassNotFoundException e) {
			 e.printStackTrace();
			 
			}
		 	catch (SQLException e) {
			 e.printStackTrace();
			 
		 	}
		
	}
	
	
	/**
	 * Add a book to data base 
	 * return 0 if not added
	 * 
	 * @param book  
	 * 
	 */
	public int add(Book book) {
		try {
			stm=con.createStatement();
			String req="INSERT INTO book(title, author, price, releaseDate)"
		 + " VALUES ('"+book.getTitle()+"','"+book.getAuthor()+"','"+book.getPrice()+"','"+book.getReleaseDate()+"')";
		 		
		 return stm.executeUpdate(req);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
        
    }
	
	
	public void displayAllBooks(){
		
		
		try {
			stm = con.createStatement();
			String req = "SELECT * FROM book";
			res= stm.executeQuery(req);
			while(res.next()) {
				
				System.out.println("id : "+res.getInt("bookId"));
				System.out.println("Title : "+res.getString("title"));
				System.out.println("Author : "+res.getString("author"));
				System.out.println("Price : "+res.getFloat("price"));
				System.out.println("Release date : "+res.getDate("releaseDate"));
			}
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}
	
	
	

}
