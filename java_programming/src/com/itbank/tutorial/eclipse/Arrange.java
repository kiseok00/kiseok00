package com.itbank.tutorial.eclipse;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrange {

	public static void main(String[] args) {
		//1차원 배열 --> 출력할때 Arrays.toString 형식을 씀
		int[] a = {1,2,3,4,5};
		int [] b = {1,2,3,5,4};
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a,b));
		
		Arrays.sort(b); //{1,2,3,4,5}로 정렬이 됨
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a,b));
		
		Arrays.fill(a, 4);
		System.out.println(Arrays.toString(a));
		
		int [] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"월","화","수","목","금","토","일"};
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));
		System.out.println(weeks[1]);
		
		// 주의: 배열의 한계--> 크기가 정해져있다.
		System.out.println(weeks[6]); //일
		System.out.println(weeks[5]); // 에러 발생 ArrayIndexOutOfBoundsException -->배열의 인덱스가 정해진 범위를 넘어섰다라는 오류 문구 알아두기
		
		int[] array3 = new int[10]; 
		//for문을 이용해서 i번째 인덱스에 1~10까지 할당
		for(int i=0;i<=9;i++)     // --> for(int i=0;i<array3.length;i++)도 가능
		{
			array3[i]=i+1;
			System.out.println(Arrays.toString(array3));
		}
		
		
		 //2차원 배열  --> 출력할 때 Arrays.deepToString 형식을 씀
		int [][] array4 = new int [3][4];
		System.out.println(Arrays.deepToString(array4));
		//[3] : 바깥쪽 배열의 크기
		//[4] : 내부 배열의 크기
		
		int [][] array5 = new int[3][];
		//array5 : 3개짜리 배열을 참조해 생성.하지만 3개짜리 배열은 아직 참조하는 배열 없음.
		array5[0] = new int[1]; //크기가 1인 배열을 생성함과 동시에 array5의 0번째 인덱스가 참조함
		array5[1] = new int[2]; //크기가 2인 배열을 생성함과 동시에 array5의 1번째 인덱스가 참조함
		array5[2] = new int[3]; //크기가 3인 배열을 생성함과 동시에 array5의 2번째 인덱스가 참조함
		System.out.println(Arrays.deepToString(array5));
		
		int [][] array6 = {{1},{2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(array6));
		System.out.println(array6[0][0]);
		System.out.println(array6[2][1]);
		
		int[][] test = {{1},{1,2},{1,2,3},{1,2,3,4}};
		//2차원 배열  test의 각 원소 출력하기 -> for문을 이용하기
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++)      //->for(int j=0;j<=i;j++) 도 됨
			{
				System.out.print(test[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//리스트(List)
		//리스트는 배열과 비슷한 자바의 자료형. 배열보다 편리한 기능을 가지고 있음.
		//배열은 크기가 정해져 있는 반면, 리스트는 크기가 정해져 있지 않아 제약사항 없이 편리함.
		//List 자료형 -> ArrayList, LinkedList ... 자료형 존재
		//가장 간단한 형태의 자료형인 ArrayList 해보기
		
		
		ArrayList<String> list1 = new ArrayList<String >(); // ctrl+ shift+ o : import 오류를 자동으로 잡아줌.
		list1.add("one");
		list1.add("two");
		list1.add(2,"three");
		list1.add(3,"four");
		//list1.add(4,"four");  IndexOutOfBoundsException
		System.out.println(list1);  //출력할 때 Arrays.toString 이나 Arrays.deepToString과 같은 형식 필요 없이 그냥 list의 변수명만 넣으면 됨.
		
		
		
		
		
		//get:특정 인덱스값 추출
		System.out.println(list1.get(3));
		
		
		
		
		//size : 리스트 크기
		System.out.println(list1.size());
		
		
		
		
		//contains: 리스트 안에 특정값이 존재유무 판별 --> boolean으로 리턴함
		System.out.println(list1.contains("five"));  //false로 리턴이 됨

		
		
		
		// remove: 리스트에서 엘리먼트 삭제 가능
		System.out.println(list1.remove("one")); //이것도 boolean형으로 출력됨
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
		
		
		
		
		

	}

}
