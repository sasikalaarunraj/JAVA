package pailagam;
public class Fibonacci_Series {
	public static void main(String[] args) {
		int n,n1=0,n2=1;
		System.out.print(n1+" "+n2+" " );
		for(int i=0;i<=10;i++) {
		n=n1+n2;
		System.out.print(n+" " );
		n1=n2;
		n2=n;
		}
	}
}
