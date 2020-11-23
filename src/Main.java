import java.sql.*;
import java.sql.Date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* // For the Step 1   
		try {
			
			 // create a new scanner
			Scanner input= new Scanner(System.in);
			
			System.out.println("Please set the unit price ");
			// get the unit price from the user
			float uPrice= input.nextFloat();
			
			System.out.println("Please set the quantity ");			
			// get the quantity from the user
			int qte= input.nextInt();
			// closing the scanner
			input.close();
			
			Product produit = new Product();
			System.out.println("Total price = " + produit.calculateTotalPrice(qte, uPrice));
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("Input Invalid !!!! ");
		}
		
		*/
		try {
			Book book1 = new Book("title1", "Author1",12.23f ,Date.valueOf("2020-12-09"));
			Connexion con = new Connexion();
			int x = con.add(book1);
			if(x==0)
				System.out.println("Not added in data base");
			else
				System.out.println("Added !!");
			
			System.out.println("All books in data base :");
			con.displayAllBooks();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		

	}

}
