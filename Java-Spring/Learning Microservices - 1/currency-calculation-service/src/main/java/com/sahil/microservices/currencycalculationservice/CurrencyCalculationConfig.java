package com.sahil.microservices.currencycalculationservice;

public class CurrencyCalculationConfig {
	
	private int max;
	private int min;

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public CurrencyCalculationConfig() {
	}

	public CurrencyCalculationConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

}
