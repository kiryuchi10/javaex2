package com.javex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month;
		month=scanner.nextInt();
		String message;
		
		
		
		switch(month){
			case 1:
				System.out.println("31");
				break;
			case 2:
				System.out.println("28");
				break;
			case 3:
				System.out.println("31");
				break;
			case 4:
				System.out.println("30");
				break;
			case 5:
				System.out.println("31");
				break;
			case 6:
				System.out.println("30");
				break;
			case 7:
				System.out.println("31");
				break;
			case 8:
				System.out.println("31");
				break;
			case 9:
				System.out.println("30");
				break;
			case 10:
				System.out.println("31");
				break;
			case 11:
				System.out.println("30");
				break;
			case 12:
				System.out.println("31");
				break;
			default:
				System.out.println("?");
		}
		scanner.close();
	}
}