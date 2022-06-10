package pailagam;

import java.util.Scanner;

public class Greatest_Common_Factor {

	public static void main(String[] args) {
		        int hcf=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number: ");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				int min=n1<n2?n1:n2;
				while(true) {
				if((n1%min==0)&&(n2%min==0)) {
					hcf=min;
					break;
				}
				min--;
			}
				System.out.println("GCF of given number is : "+hcf);
		}
	
	}


