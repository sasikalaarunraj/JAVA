package pailagam;

import java.util.Scanner;

public class Least_Common_Multiple {

	public static void main(String[] args) {
        int lcm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max=n1>n2?n1:n2;
		while(true) {
		if((max%n1==0)&&(max%n2==0)) {
			lcm=max;
			break;
		}
		max++;
	}
		System.out.println("LCM of given number is : "+lcm);
}
}
