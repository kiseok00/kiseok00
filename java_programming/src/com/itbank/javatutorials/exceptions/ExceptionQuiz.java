package com.itbank.javatutorials.exceptions;

public class ExceptionQuiz {

	public static void main(String[] args) {
		int [] array = new int[10];
		
		/*       array[20]=5;
		 * try,catch 문을 이용해서 예외처리 ->자바에서 기본 제공되는 예외처리 메소드 사용
		 * finally도 이용해서 항상 "finally"를 출력가능 하도록
		 */
		try {
			array[20]=5;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}finally {
			System.out.println("finally");
		}
	}

}
