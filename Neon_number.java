package pailagam;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		int sum=0,n,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();//9
		int temp=n1;//9
	    sum=(int) (sum+Math.pow(n1,2));
	    while(sum!=0) {
	    	n=sum%10; //1 8
	    	sum=sum/10; //8 0
	    	rem=rem+n;
	    }
       if(rem==n1) {
	System.out.println(n1+ " is a neon number");
       }
       else {
    	   System.out.println(n1+ " is a neon number");
}
	}

}
