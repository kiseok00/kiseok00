package com.itbank.javatutorials.interfaces;

class X{
	public String a() {
		return "x.a";
	}
}
class Y extends X{
	public String a() {
		return "y.a";
	}
	public String b(){
		return "b";
	}
}

class Y2 extends X{
	public String a() {
		return "Y2.a";
	}
}


//Ŭ������ ������
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
		X obj2 = new Y2();
		
		System.out.println(obj.a()); //y.a
		System.out.println(obj2.a());//y2.a
		
		//obj.b();// ����

		
		//������ ������Ÿ������ �����ϸ鼭�� 
		//������ Ŭ������ �ҼӵǾ��ִ� �޼ҵ��� ���۹�Ĵ�� �����ϰ� ����
		//��, �������̵��� �޼ҵ忡 ���ؼ���.
	}

}
