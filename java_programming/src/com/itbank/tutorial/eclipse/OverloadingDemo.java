package com.itbank.tutorial.eclipse;

//Overloading(오버로딩)
//똑같은 동작 방법, 똑같은 로직을 가지고 있지만, 매개변수가 달라짐에 따라서
//다른 이름을 가질 수 밖에 없는 문제를 해결하기 위한 방법
class Calculator8{
	int one,two;
	int three=0;
	
	
	public void setOprands() {
		System.out.println("setOprands()");
	}
	
	public void setOprands(int one) {
		this.one = one;
	}
	
	public void setOprands(int one,int two) {
		this.one = one;
		this.two=two;
		System.out.println("setOprands(int one,two)");
		
	}
	//같은 이름, 같은 동작방식을 갖는 메소드를 정의해줌
	//자바에서는 메소등의 이름이 같다고 하더라도 메소드의 매개변수의 데이터타입이나
	//혹은 매개변수의 개수가 달라지면 다른 메소드로 인식하게 됨
	public void setOprands(int one,int two,int three) {
		//this.one = one;
		//this.two=two;
		//this를 사용한 개선
		this.setOprands(one, two);
		//로직의 재활용성, 중복의 제거, 유지보수의 편의성 동시에 달성
		this.three=three;
		System.out.println("setOprands2(int one,int two,int three)");
	}
	
	public void sum() {
		System.out.println(this.one +this.two+ this.three);
	}
	
}
public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
		c1.setOprands(10,20);      //setOprands(int one,two)
		c1.sum(); 	// 30 ->10+20+0
		c1.setOprands(10,20,30);     //setOprands2(int one,int two,int three)
		c1.sum(); // 60-> 10+20+30
		
		
		//위의 코드처럼, 매개변수의 수에 따라서 메소드의 이름이 달라지는것 ->  bad
		//사용자가 메소드를 호출할 때마다 해당 메소드의 매개변수의 개수를 기억했다가 
		// 올바른 메소드를 호출해야하는 문제점이 발생
		
		//오버로딩: 같은 이름의 메소드를 여러개 정의하는 방법
		
		//자바 -> 메소드내에 출력문을 넣는 것은 해당 메소드가 호출되었는지 확인하는 용도로 사용
		
		
	}

}
