package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BrazilInterestService;
import model.entities.UsaInterestService;
import model.interfaces.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Amount: "); //200.00
		double amount = sc.nextDouble(); 
		System.out.print("Months: "); //3
		int months = sc.nextInt(); 
		
		InterestService is = new BrazilInterestService(2.0); 
		
		double payment = is.payment(amount, months);
		System.out.println("Payment after 3 months:");
		System.out.println(String.format("%.2f", payment));
				
		sc.close();
	}

}
