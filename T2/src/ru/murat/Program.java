package ru.murat;

import java.util.Scanner;

/**
*@author Murat
*
*/
public class Program {

	public static void main(String args[]) {
		
		System.out.printf("Input your line:");
		Scanner sc =new Scanner(System.in);
		int res = Tasktwo.line(sc.nextLine());
		System.out.println((res==-2?"Wrong input try again":res==-1?"empty string":"Amount of A is "+res));
	}
}
