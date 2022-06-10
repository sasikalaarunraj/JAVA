package pailagam;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args) {
		int n1,n2=0,n3=0,i=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	//1234
		int temp=n;
		while(n!=0) {
			n1=n%10;//4
			n=n/10;//123
			n2=(n2*10)+n1;//4
			//n3=n3+n2;
			//i=i/10;	
		}
		System.out.println(n2);
		if(n2==temp) {
			System.out.println(n2+ " Given  number is palindrome");
		}
		else {
			System.out.println(n2+ " Given  number is not a palindrome");
		}
		}
      

}
