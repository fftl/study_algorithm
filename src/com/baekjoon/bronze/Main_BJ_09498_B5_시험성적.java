package com.baekjoon.bronze;

import java.util.Scanner;

public class Main_BJ_09498_B5_시험성적 {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=90) System.out.println("A");
		else if(n>=80) System.out.println("B");
		else if(n>=70) System.out.println("C");
		else if(n>=60) System.out.println("D");
		else System.out.println("F");
		sc.close();
	}
}
