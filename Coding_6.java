//Write the program to print Fibonacci series upto n

package codind_2;
import java.util.Scanner;
public class Coding_6 {
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int n=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<=n;i++) {
			n3=n1+n2;//0+0=0;0+1=1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
