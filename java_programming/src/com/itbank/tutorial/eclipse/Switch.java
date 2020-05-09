package com.itbank.tutorial.eclipse;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int a=scan.nextInt();
		switch(a) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("augu");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("novem");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("wrong");
		}
		
		
	}

}
