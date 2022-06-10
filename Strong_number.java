package pailagam;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();
		int temp=n1;//145
		while(n1>0) {//145
			int n=1;
			int s=n1%10; //5
		while(s!=0) {//5
			 //5 
			n=n*s;//(1*5)  (5*4) (20*3) (60*20) (120*1) 
			s=s-1;
		}
		sum=sum+n;
		n1=n1/10;//14
		}
		if(sum==temp) {
			System.out.println(temp+" given number is strong number");
		}
		else {
			System.out.println(temp+" given number is not strong number");
		}
	}

}
