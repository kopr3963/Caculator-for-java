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
	
	/*
	 * 배열로 넣고 싶을 때 사용하세요.
	 */
	void setNumberArray(int[] numbers){
		int size = numbers.length;
		int temp = 0;
		
		for (int i =0;  i < size; i++ ){
//			result = result - numbers[i];
//			temp = numbers[i];
//			result = temp - temp;
//			temp = numbers[i] - numbers[i];
			
//			temp = numbers[i];
			System.out.println(numbers[i]);
		}
		this.result = result;
	}
	
	
	public int getSubtractionResult(){
		
		return this.result;
	}
	public static void main(String[] args) {
		
		int[] numbers = {2,5,7};
		
		Subtraction subtraction = new Subtraction();
		subtraction.setNumberArray(numbers);
		System.out.println(2-5-7);
		System.out.println(subtraction.getSubtractionResult());
	}
}
