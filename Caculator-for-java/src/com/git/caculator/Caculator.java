package com.git.caculator;

import java.util.Scanner;

public class Caculator {

	private static Object number1;
	private static Object number2;
	private static Object result ;
	
	
	private static Object test_object;
	

	public Caculator() {
	}

	public static void main(String[] args) {

		Subtraction subtraction = new Subtraction();

		System.out.println("계산기");
		
		System.out.println("첫번째 값 : ");
		Scanner scanner = new Scanner(System.in);
		String calculation = scanner.nextLine();

		System.out.println(calculation.getClass().getName());
		//연산 기호
		Scanner scanner2 = new Scanner(System.in);
		scanner2.nextLine();
		
		System.out.println("두번째 값 : ");
		Scanner scanner3 = new Scanner(System.in);
		scanner3.nextLine();
		
		
		
		if (scanner2.equals("-")){
			
		}
		
		
		
//		if (calculation.indexOf("-") != -1) {
//			
//			number1 = (Object) calculation.split("-")[0];
//			number2 = (Object) calculation.split("-")[1];
//			
////			number1 = Integer.parseInt(calculation.split("-")[0]);
////			number2 = Integer.parseInt(calculation.split("-")[1]);
//			
//			subtraction.setNumber(number1, number2);
//			result = subtraction.getSubtractionResult();
//			System.out.println(result);
//		}
		
		

	}

	@Override
	public String toString() {
		return super.toString();
	}
}
