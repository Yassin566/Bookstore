import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 
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
		
		
		
		
		

	}

}
