package com.itbank.tutorial.eclipse;

//OverloadingDemo 코드 개선하기

class Calculator9{
	int[] oprands; //배열
	
	//매개변수로 배열 사용
	//이렇게 배열을 사용하면 하나의 인자로 여러개의 값을 받을 수 있다.
	public void setOprands(int[] oprands) {
		this.oprands=oprands;
	}
	public void sum() {
		int total =0;
		//for-each 문 배열에 있는 수를 하나씩 차례로 꺼낼 때 사용
		for(int value: this.oprands) {
			total+=value;
			
		}
		System.out.println(total);
	}
	//avg()구현
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
