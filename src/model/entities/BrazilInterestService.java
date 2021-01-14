package model.entities;

import java.security.InvalidParameterException;

import model.interfaces.InterestService;

public class BrazilInterestService implements InterestService{
	
	//Atributos 
	private Double interestRate;
	
	//Construtores 
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	//Getters and Setters 
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
