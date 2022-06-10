package pailagam;

public class Armstrong_number {

	public static void main(String[] args) {
		int i,j,sum=0;;
		for(j=0;j<=1000;j++){
		i=j;
		while(i>0){
		int LastDigit=i%10; //3 5 1
		i=i/10;//15     1 0
		 sum=(int) (sum+Math.pow(LastDigit,3));//27+125+1=153
		 }
		if(sum==j) 
		System.out.println(j+" armstriong  Number");              
		                }
			}
	}
