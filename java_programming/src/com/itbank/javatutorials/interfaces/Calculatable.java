package com.itbank.javatutorials.interfaces;


//�������̽� ����
//�߸��� Ŀ�´����̼����� ���� �߸� ���ߵǴ� ������ �߻��� �� �ִµ�,
//�̸� �����ϱ� ���ؼ� ����� ���صδ� ��
public interface Calculatable {
	public void setOprands(int first,int second,int third);
	public int sum();
	public int avg();
	
	
	//�������̽� ���� �޼ҵ���� public���� �����Ǿ�����
	//�������̽��� ��ü������ �����ϰ� �ִ� Ŭ������ �ܺο��� �����ϱ� ���� ������ġ�̴�.
	//���� �������̽��� ������� ���������ڴ� �ݵ��  public�̾�� �Ѵ�.
}
