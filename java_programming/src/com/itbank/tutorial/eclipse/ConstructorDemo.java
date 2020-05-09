package com.itbank.tutorial.eclipse;

// 상속: 물려준다는 의미
// 어떤 객체가 있을때 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능

//class Calculator (extends Object)
//Object: 모든 클래스의 공통된 조상
// 아무것도 상속받지 않고 있다면 암묵적으로 Object클래스를 상속받게됨.
//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//따라서  Object  클래스의 메소드들을 상속받아서 쓸 수 있다는 의미

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left =left;
		this.right = right;
	}
}


class C3{
	
	static int base=10;
	int a,b;
	
	//생성자
	//어떤 메소드보다도 먼저 실행됨
	//객체가 가장 먼저 해야할 일, 즉 초기화를 실행하게 됨
	//생성자의 이름은 반드시 클래스의 이름과 동일해야함.
	public C3(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int sum()
	{
		return a+b;
	}
	public int avg() {
		return(a+b)/2;
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		/*C3 calc = new C3();
		calc.setNum(3, 5);
		System.out.println(calc.sum());
		System.out.println(calc.avg());*/
		
		
		//이렇게 변수 초기값 설정을 객체 생성 당시에 강제함
		//따라서 객체를 사용할 때 반드시 해야하는 일을 놓치지 않게 함
		C3 calc = new C3(3,5);
		System.out.println(calc.sum());
		
		
		
		//결론 
		//클래스 정의할 떄, 생성자가 존재하지 않으면 자동 생성해줌.
		//따라서 객체 생성할 때, new 뒹 C3()처럼 오는 것은 생성자를 의미한다.
		
		
	}
	}


