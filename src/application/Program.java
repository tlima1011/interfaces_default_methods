package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Amount: "); //200.00
		double amount = sc.nextDouble(); 
		System.out.print("Months: "); //3
		int months = sc.nextInt(); 
		
		UsaInterestService bs = new UsaInterestService(1.0); 
		
		double payment = bs.payment(amount, months);
		System.out.println("Payment after 3 months:");
		System.out.println(String.format("%.2f", payment));
				
		sc.close();
	}

}
