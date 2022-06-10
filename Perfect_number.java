package pailagam;
import java.util.Scanner;
public class Perfect_number {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		int temp=n;
        for (int i = 1; i < n; i++) {
	    if(n%i==0) {
	    	sum=sum+i;
	    }
        }
	    	if(sum==temp) {
	    		System.out.println(temp+ " is a perfect number");
	    	}
	    	else {
	    		System.out.println(temp+ " is not a perfect number");
	    	}
	    }
      }


