package com.git.caculator;

import java.util.Scanner;

public class Caculator {

	private static int number1;
	private static int number2;
	private static int result = 0;

	public Caculator() {
	}

	public static void main(String[] args) {

		Subtraction subtraction = new Subtraction();

		System.out.println("계산기");
		Scanner scanner = new Scanner(System.in);
		String calculation = scanner.nextLine();

		
		if (calculation.indexOf("-") != -1) {
			number1 = Integer.parseInt(calculation.split("-")[0]);
			number2 = Integer.parseInt(calculation.split("-")[1]);
			subtraction.setNumber(number1, number2);
			result = subtraction.getSubtractionResult();
			System.out.println(result);
		}
		
		

	}

	@Override
	public String toString() {
		return super.toString();
	}
}
