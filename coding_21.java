//write a java program to find nCr, where n and r values are given
package codind_2;
import java.util.*;
public class coding_21 {
	public static void main(String[] args) {
		int res=1,sum=1,temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value: ");
		int n=sc.nextInt();
		System.out.println("enter the r value: ");
		int r=sc.nextInt();
		for(int i=1;i<=n;i++) {
		 res=res*i; //1*1=1*2
		}
		 for(int j=1;j<=r;j++) {
			 sum=sum*j;
		 }
		for(int k=1;k<=(n-r);k++) {
		temp=temp*k;
	     }
		 int output=res/(sum*temp);
		 System.out.println(output);
		}
	}


