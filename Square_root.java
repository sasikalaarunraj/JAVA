package pailagam;
import java.util.Scanner;
public class Square_root {
	public static void main(String[] args) {
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n1=sc.nextInt();
		for(int i=2;i<n1;i++) {
			j=n1/i;
			if(j==i) {
				System.out.println("The perfect square of the given number is: "+i);
			}
		}
	}
}
