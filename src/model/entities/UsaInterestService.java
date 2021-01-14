package model.entities;

import java.security.InvalidParameterException;

import model.interfaces.InterestService;

public class UsaInterestService implements InterestService {

	// Atributos
	private Double interestRate;

	// Construtores
	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	// Getters and Setters
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
