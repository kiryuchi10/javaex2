package com.javex.basic.console;
import java.util.Scanner;


public class ConsoleInputEx {

	public static void main(String[] args) {
		// Scanner 열기
		Scanner scanner = new Scanner(System.in);
	
		// 데이터 입력
		int age;
		System.out.print("나이는 :?");
		age=scanner.nextInt();
		String name;
		System.out.print("이름은 :?");
		name=scanner.next();
		
		System.out.println("안녕하세요, " +name+"님");
		// 스캐너 닫기 
		scanner.close();
	}

}