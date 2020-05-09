package com.itbank.tutorial.eclipse;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("id, password를 입력하세요");
		String id =scan.next();
		int password =scan.nextInt();
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		if(id.equals("Eclipse")) {
			System.out.println("welcome!");
		}
		else {
			System.out.println("enter the right id");
		}
		if (password==0000) {
			System.out.println("welcome!");
		}
		else {
			System.out.println("enter the right password");
		}
		
		
		

	}

}
