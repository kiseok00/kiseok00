package com.itbank.tutorial.eclipse;

public class For {

	public static void main(String[] args) {
		/*int sum=0;
		for(int i=0;i<4;i++)
		{
			sum+=i; //sum = sum + i;
		}
		System.out.println(sum);
		
		//0���� 10���� 1�� �����ϸ� ���������, 3�� ���� ���  x*/
		
		
		/*for (int i=0;i<11;i++)
		{
			if(i%3!=0) {
				System.out.println(i);
			}
			else
				continue;
				
		}
		*/
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print( i*j+" ");
			}
			System.out.println();
		}

	}

}
