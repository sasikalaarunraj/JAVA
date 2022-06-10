/*In a program, if the array is final, each array element is multiplied by 10 and stored in the
same array location. What is the result? Tell your opinion*/

		package codind_2;

public class Coding_4 {
	public static void main(String[] args) {
		final int[] a= {2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*10;
			System.out.println("output is: "+a[i]);
		}
	}
}
