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
		String str4 =new String ("hello world"); //new :  ���ο� ��ü ���� �� ��� ,��ü: ���� ������ �ڷ���
		System.out.println(str3==str4);
		System.out.println(str3.equals((str4)));
		
		String a = "hello java";
		//indexOf: ���ڿ����� Ư�����ڰ� ���۵Ǵ� �ε��� ����
		System.out.println(a.indexOf("java"));
		System.out.println(a.replaceAll("java","world"));
		//ù ����<= >������
		System.out.println(a.substring(0,4)); //hell
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

}
