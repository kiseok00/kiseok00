package com.itbank.javatutorials.interfaces;

//�������̽��� ����� �ɱ�?
//yes
//Ŭ������ �����ϰ� �ִ� �������̽���
//����ϰ��ִ� �������̽��� �޼ҵ�鵵 �ش� Ŭ�������� ������ ����� ��
interface I3{
	public void x();
}
interface I4 extends I3{
	public void y();
}


public class C implements I4 {
	public void y() {}
	public void x() {}

}