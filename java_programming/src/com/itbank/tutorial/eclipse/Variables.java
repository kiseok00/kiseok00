package com.itbank.tutorial.eclipse;

public class Variables {

	public static void main(String[] args) {
		boolean isSuccess =true;
		boolean isComplete=false;

		
		// ==,!=,>,>=,<,<=
		System.out.println(1<3);
		System.out.println("one"=="one10");
		System.out.println(1!=2);
		System.out.println(10>=10);
		
		String str1="hello java";
		String str2="123";
		
		System.out.println(str1+str2);
		
		String str3 =new String ("hello world");
		String str4 =new String ("hello world"); //new :  새로운 객체 만들 떄 사용 ,객체: 새로 생성된 자료형
		System.out.println(str3==str4);
		System.out.println(str3.equals((str4)));
		
		String a = "hello java";
		//indexOf: 문자열에서 특정문자가 시작되는 인덱스 리턴
		System.out.println(a.indexOf("java"));
		System.out.println(a.replaceAll("java","world"));
		//첫 지점<= >끝지점
		System.out.println(a.substring(0,4)); //hell
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

}
