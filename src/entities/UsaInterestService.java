package entities;

import java.security.InvalidParameterException;

public class UsaInterestService {
	
		//Atributos 
		private Double interestRate;
		
		//Construtores 
		public UsaInterestService(Double interestRate) {
			this.interestRate = interestRate;
		}
		//Getters and Setters 
		public Double getInterestRate() {
			return interestRate;
		}
		//Methods 
		public double payment(double amount, int months) {
			if(months < 1) {
				throw new InvalidParameterException("Months must be greater than zero"); 
			}
			return amount * Math.pow(1.0 + interestRate / 100.0, months);
		}

}