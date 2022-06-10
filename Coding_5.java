//Write a java program to reverse the digits of the given number like 967 is to be 769
package codind_2;

import java.util.Scanner;

public class Coding_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int s=sc.nextInt();
		int sum=0;
		while(s!=0) {
		int k=s%10;//967%10=7,6
		sum=sum*10+k; //
		s=s/10;//96,9
		//int m=k*i;//700 60
		//i=i/10;//10
		//sum=sum+m;
		
	}
		System.out.println(sum);
	}

}
