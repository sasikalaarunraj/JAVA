package pailagam;

import java.util.Scanner;

public class Addition_of_Digits {

	public static void main(String[] args) {
		int n1,count=0,n2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		while(n!=0) {
			n1=n%10;//4 3 2 1
			n=n/10;//123 12 1 0
			count=count+n1;//1 2 3 4
		}
		System.out.println("No of digits in given number is: "+count);
		if(count>9) {
			while(count!=0) {
			int s=count%10; //0
			count=count/10;//1
			n2=n2+s;
		}
			System.out.println(n2);
	}
	}
	}

