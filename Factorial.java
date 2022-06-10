package pailagam;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int n=1,n1=5,n2=0;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();//5	*/
		int temp=n1;//5
		while(temp>0) {
			n=1;
		while(n1>0) {
			n=n*n1;//(1*5)  (5*4) (20*3) (60*20) (120*1) 
			n1=n1-1;
		}
	System.out.println(n);
     temp=temp-1;
     n1=temp;//4
    
		}
	}
}
