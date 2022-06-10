package pailagam;

public class Array_1 {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};int temp=0;
	int i=0,j=arr.length-1;
	while(i<j) {
			temp=arr[i];//10
			arr[i]=arr[j];//50
			arr[j]=temp;	//10	
			i=i+1;
			j=j-1;
		}
		
		for(int k=0;k<=arr.length-1;k++) {
        System.out.println(arr[k]);
	}

	}

}
