package com.sahil.microservices.limitsservice;

public class LimitConfig {

	private int max;
	private int min;

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public LimitConfig() {
	}

	public LimitConfig(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

}
