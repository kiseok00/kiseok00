package com.itbank.tutorial.eclipse;

//클래스 메소드:static??
class C1{
	//static을 멤버(변수,메소드)앞에 붙이면 클래스의 멤버가 됨.
	static int base=10;
	int a,b;
	
	public void setNum(int a, int b) {
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
	
	

	public static int multiply(int c, int d) {
		return c*d;
		
	}
	
	
	//클래스 메소드가 인스턴스 변수에 접근 가능한가?
	public static void static_multiply() {
		System.out.println(b + base);
	}
	//결론: 클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
	//이유? 인스턴스 변수는 인스턴스가 만들어지면서  생성되는데, 클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에 클래스 메소드가 인스턴스 멤버에 접근한다는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같음.
}



public class StaticDemo {
	
	//static:자바가 컴파일 되는 순간 정의
	//void: return값 존재하지 않음
	//public:접근 제어자. 어느 곳에서든 해당 객체를 참조할 수 있다.
	//main:프로그램의 시작
	public static void main(String[] args) {
		C1 c = new C1();
		c.setNum(3, 4);
		System.out.println(c.sum());//7
		System.out.println(c.avg());//3
		
		//멤버 ->변수(field), 메소드(method)
		//클래스 멤버 vs 인스턴스 멤버
		//인스턴스마다 서로 다른 값을 가지기 때문에 인스턴스 멤버
		//클래스 멤버는 모든 인스턴스에서 같은 값을 가짐
		
		
		
		//클래스 변수: 인스턴스를 생성하지 않고도 클래스에 직접 접근해서 클래스에 소속되어있는 변수에 접근 가능
		System.out.println(c.base); //10
		
		
		C1 c2 =new C1();
		System.out.println(c2.base);//10
		System.out.println(C1.base);//10
		C1.base=20; //클래스 변수값 변경
		
		//값의 변경사항을 모든 인스턴스가 공유
		System.out.println(c.base);//20
		System.out.println(c2.base);//20
		
		//클래스 메소드를 클래스에 직접 접근해서 호출
		//일회용처럼 한번만 사용하고 싶을때
		System.out.println(C1.multiply(4, 2));//8
		
		//메소드가 인스턴스 변수를 참조하지 않는다면, 클래스 메소드를 사용.
		//따라서 불필요한 인스턴스의 생성을 막을 수 있음.
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		
		//클래스 멤버(변수,메소드)의 효용가치: 불필요한 인스턴스의 생성을 막기 위함
		//컴파일 되는 순간 클래스 멤버가 정의됨.
		
	}


}
