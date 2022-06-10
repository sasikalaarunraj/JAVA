//Write the program to print the Armstrong numbers between 1 to n
package codind_2;

import java.util.Scanner;

public class Coding_8 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int n=sc.nextInt();
		int i,j;
		for(j=1;j<=n;j++)
		{
			i=j;
			int LastDigit=i%10; //3 5
			i=i/10;//15
	        sum=(int) (sum+Math.pow(LastDigit,3));
			
		}
		if(sum==j) 
			System.out.println(j+" armstriong  Number");
			else
			System.out.println(j+"not armstrong number");	


	}

}
