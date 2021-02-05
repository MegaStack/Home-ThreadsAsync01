package com.gmail.oastro36;

import java.math.BigInteger;

public class MyFactorial implements Runnable{

	private int num;
		
	public MyFactorial(int num) {
		super();
		this.num = num;
	}

	public MyFactorial() {
		super();
	}

	public int getNum() {
		return num;
	}
	
	private BigInteger calculateFact(int num) {
		BigInteger fact = new BigInteger("1");
		for(int i = 2; i<= num; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		BigInteger fact = calculateFact(num);
		System.out.println(thr.getName() + " found factorial of digit " + num + " = " + fact);
	}
	
}
