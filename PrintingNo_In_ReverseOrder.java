package pailagam;

import java.util.Scanner;

public class PrintingNo_In_ReverseOrder {

	public static void main(String[] args) {
		// Printing No. In Reverse Order
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n=sc.nextInt();
		for (int i = n; i >0; i--) {
			System.out.print(i+" ");	
		}	
	}
}
