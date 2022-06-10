package pailagam;

import java.util.Scanner;
public class DtoB {
	public static void main(String[] args) {
		dtob();
		btod();
	}
	public static void dtob() {
			int rem=0;
		String bin=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		while(n!=0) {
			rem=n%2;//0 1
			n=n/2;//3 
			bin=rem+bin;	
		}
		System.out.println(bin);
		}
		
		public static void btod() {
			int rem=0,i=0,dec=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	//1010
		while(n!=0) {
			rem=n%10;//0
			n=n/10;//10
			dec=(int) (dec+(rem*Math.pow(2, i)));
			i=i+1;
		}
		System.out.println(dec);
	}
}
