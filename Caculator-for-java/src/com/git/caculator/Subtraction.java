package com.git.caculator;

/*
 * 마이너스 클래스
 */
public class Subtraction {
	
	int result = 0;
	
	void Subtraction(){
		result = 0;
		System.out.println("빼기연산을 하는 클래스.");
	}
	
	
	public void setNumber(int num1, int num2){
		this. result = num1 - num2;
	}
	/*
	 * 배열로 넣고 싶을 때 사용하세요.
	 */
	public int getSubtractionResult(){
		return this.result;
	}
	
}
