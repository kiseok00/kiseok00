package com.itbank.tutorial.eclipse;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrange {

	public static void main(String[] args) {
		//1���� �迭 --> ����Ҷ� Arrays.toString ������ ��
		int[] a = {1,2,3,4,5};
		int [] b = {1,2,3,5,4};
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a,b));
		
		Arrays.sort(b); //{1,2,3,4,5}�� ������ ��
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a,b));
		
		Arrays.fill(a, 4);
		System.out.println(Arrays.toString(a));
		
		int [] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"��","ȭ","��","��","��","��","��"};
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));
		System.out.println(weeks[1]);
		
		// ����: �迭�� �Ѱ�--> ũ�Ⱑ �������ִ�.
		System.out.println(weeks[6]); //��
		System.out.println(weeks[5]); // ���� �߻� ArrayIndexOutOfBoundsException -->�迭�� �ε����� ������ ������ �Ѿ�ٶ�� ���� ���� �˾Ƶα�
		
		int[] array3 = new int[10]; 
		//for���� �̿��ؼ� i��° �ε����� 1~10���� �Ҵ�
		for(int i=0;i<=9;i++)     // --> for(int i=0;i<array3.length;i++)�� ����
		{
			array3[i]=i+1;
			System.out.println(Arrays.toString(array3));
		}
		
		
		 //2���� �迭  --> ����� �� Arrays.deepToString ������ ��
		int [][] array4 = new int [3][4];
		System.out.println(Arrays.deepToString(array4));
		//[3] : �ٱ��� �迭�� ũ��
		//[4] : ���� �迭�� ũ��
		
		int [][] array5 = new int[3][];
		//array5 : 3��¥�� �迭�� ������ ����.������ 3��¥�� �迭�� ���� �����ϴ� �迭 ����.
		array5[0] = new int[1]; //ũ�Ⱑ 1�� �迭�� �����԰� ���ÿ� array5�� 0��° �ε����� ������
		array5[1] = new int[2]; //ũ�Ⱑ 2�� �迭�� �����԰� ���ÿ� array5�� 1��° �ε����� ������
		array5[2] = new int[3]; //ũ�Ⱑ 3�� �迭�� �����԰� ���ÿ� array5�� 2��° �ε����� ������
		System.out.println(Arrays.deepToString(array5));
		
		int [][] array6 = {{1},{2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(array6));
		System.out.println(array6[0][0]);
		System.out.println(array6[2][1]);
		
		int[][] test = {{1},{1,2},{1,2,3},{1,2,3,4}};
		//2���� �迭  test�� �� ���� ����ϱ� -> for���� �̿��ϱ�
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++)      //->for(int j=0;j<=i;j++) �� ��
			{
				System.out.print(test[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//����Ʈ(List)
		//����Ʈ�� �迭�� ����� �ڹ��� �ڷ���. �迭���� ���� ����� ������ ����.
		//�迭�� ũ�Ⱑ ������ �ִ� �ݸ�, ����Ʈ�� ũ�Ⱑ ������ ���� �ʾ� ������� ���� ����.
		//List �ڷ��� -> ArrayList, LinkedList ... �ڷ��� ����
		//���� ������ ������ �ڷ����� ArrayList �غ���
		
		
		ArrayList<String> list1 = new ArrayList<String >(); // ctrl+ shift+ o : import ������ �ڵ����� �����.
		list1.add("one");
		list1.add("two");
		list1.add(2,"three");
		list1.add(3,"four");
		//list1.add(4,"four");  IndexOutOfBoundsException
		System.out.println(list1);  //����� �� Arrays.toString �̳� Arrays.deepToString�� ���� ���� �ʿ� ���� �׳� list�� ������ ������ ��.
		
		
		
		
		
		//get:Ư�� �ε����� ����
		System.out.println(list1.get(3));
		
		
		
		
		//size : ����Ʈ ũ��
		System.out.println(list1.size());
		
		
		
		
		//contains: ����Ʈ �ȿ� Ư������ �������� �Ǻ� --> boolean���� ������
		System.out.println(list1.contains("five"));  //false�� ������ ��

		
		
		
		// remove: ����Ʈ���� ������Ʈ ���� ����
		System.out.println(list1.remove("one")); //�̰͵� boolean������ ��µ�
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
		
		
		
		
		

	}

}
