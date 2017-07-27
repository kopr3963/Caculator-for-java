package com.git.caculator;

/*
 * 마이너스 클래스
 */
public class Subtraction {
	
	
	//
	Object result;
	Object num1;
	Object num2;
	
	void Subtraction(){
		result = 0;
	}
	public void setNumber(Object num1, Object num2){
		System.out.println("1번째 인자값"+num1.getClass().getName());
		System.out.println("2번째 인자값"+num2.getClass().getName());
		if (num1 instanceof Integer && num2 instanceof Integer){
			result = Integer.parseInt(num1.toString()) - Integer.parseInt(num2.toString());
		} else {
			result = Double.parseDouble(num1.toString()) - Double.parseDouble(num2.toString());
		}
	}
	
	public Object getSubtractionResult(){
		return this.result;
	}
	
}
