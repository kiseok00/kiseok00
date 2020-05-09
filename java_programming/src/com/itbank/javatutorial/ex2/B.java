package com.itbank.javatutorial.ex2;

//*의 의미: 패키지 안에 있는 모든 클래스를 가져옴(와일드 카드)
//import com.itbank.javatutorials.ex1.*;
import com.itbank.javatutorials.ex1.A; // 원하는 클래스를 특정해서 가져옴

public class B {

	public static void main(String[] args) {
		
		A a = new A(); 
		//에러 발생
		//다른 패키지에 있는 클래스 파일을 로드하는 것이 불가능.
		
		
		
		//javac 패키지경로/소스코드이름.java -d bin : 클래스 파일이 자동으로 bin 디렉토리 아래에 생성
		//

	}

}
