//Write the program to print the prime numbers between s to f.
package codind_2;
import java.util.Scanner;
public class coding_3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the s value: ");
		int s=sc.nextInt();
		System.out.println("enter the f value: ");
		int f=sc.nextInt();
		for(int i=s;i<=f;i++) {
			int count=0;
			for(int j=2;j<s;j++) {
			if(i%j==0) {
			count=count+1;
			}
			}
		if(count==0) 
			System.out.println(i+" prime number");
		else
			System.out.println(i+" not prime");
		}
		}

	}

