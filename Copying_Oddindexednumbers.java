package pailagam;

public class Copying_Oddindexednumbers {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2!=0) {	
				//System.out.println(arr[i]);
				count++;
			}
		}
       int arr1[]=new int[count];
       int j=0;
       while(j!=count) {
       for (int i = 0; i < arr.length; i++) {
       if(i%2!=0) {	
    	   arr[j]=arr[i];
    	   System.out.println(arr[j]);
    	   j++;
       }
       }
	}
      
      
	}
}

