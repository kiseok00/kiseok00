package com.itbank.tutorial.eclipse;

//OverloadingDemo �ڵ� �����ϱ�

class Calculator9{
	int[] oprands; //�迭
	
	//�Ű������� �迭 ���
	//�̷��� �迭�� ����ϸ� �ϳ��� ���ڷ� �������� ���� ���� �� �ִ�.
	public void setOprands(int[] oprands) {
		this.oprands=oprands;
	}
	public void sum() {
		int total =0;
		//for-each �� �迭�� �ִ� ���� �ϳ��� ���ʷ� ���� �� ���
		for(int value: this.oprands) {
			total+=value;
			
		}
		System.out.println(total);
	}
	//avg()����
	public void avg() {
		int total=0;
		for(int value: this.oprands) {
			total+=value;
		}
		int average;
		average=total/this.oprands.length;
		System.out.println(average);
	}
	
	
}



public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
		c1.setOprands(new int[] {10,20});
		c1.sum(); //30
		c1.avg(); //15
		c1.setOprands(new int[] {10,20,30});
		c1.sum(); //60
		c1.avg(); //20
		

	}

}
