package com.gmail.oastro36;

public class Main {

	public static void main(String[] args) {
		Thread[] thrArray = new Thread[100];

		for (int i = 0; i < thrArray.length; i++) {
			thrArray[i] = new Thread(new MyFactorial(i + 1));
		}

		for (Thread thread : thrArray) {
			thread.start();
		}
		
		for (Thread thread : thrArray) {
			try {
			thread.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("The program has finished its work.");
	}
}
