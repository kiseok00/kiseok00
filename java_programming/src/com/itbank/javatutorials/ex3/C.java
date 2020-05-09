package com.itbank.javatutorials.ex3;
//import com.itbank.javatutorials.ex1.*;
//import com.itbank.javatutorial.ex2.*;

import java.lang.*;  // 자바가 자동으로 이 패키지를  import 함
//java.lang에 있는 클래스들은 자바를 이용하는데 필수적이고 자주 이용하는 클래스















public class C {

	public static void main(String[] args) {
		//명시적으로 경로를 지정해주면 특정 클래스 인스턴스화 가능
		com.itbank.javatutorial.ex2.B b = new com.itbank.javatutorial.ex2.B();
		//에러: The type B is ambiguous
		
		
		
		
		
		System.out.println(1);
		//println(1) --> 메소드
		//System --> 클래스
		//out --> 시스템이라는 클래스의 멤버 중 하나인 변수
		//클래스를 사용하기 위해서는 인스턴스화(객체화)를 시켜주는 것이 필수.
		// 따라서 out ->static(불필요한 인스턴스의 생성을 방지하기 위함)
		

	}

}
