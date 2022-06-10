package pailagam;

import java.util.Scanner;

public class Add_n_numbers {

	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int sc=s.nextInt();
		for(int i=0;i<=sc;i++) {
			n=n+i;	
		}
		System.out.println("Addition of n number is :"+n);
	}

}
