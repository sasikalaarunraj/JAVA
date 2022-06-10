package pailagam;

public class Count_of_Duplicate {

	public static void main(String[] args) {
		int arr[]= {10,60,30,10,20,50,20,10,30,40,10,40};
		int freq[]=new int[arr.length];//0 0 0 -1 0 0 0 -1 0 0 0 0
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j <  arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=-1;
				}
			}
				if(freq[i]!=-1) {
				freq[i]=count;
				}
			}
		int countduplicate=0;
		for (int i = 0; i < arr.length; i++) {
			if(freq[i]>1) {
				countduplicate++;
				System.out.println(arr[i]+" " +freq[i]+" "+countduplicate);
		}
			}
			
		}

	}

