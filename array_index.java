package pailagam;

public class array_index {

	public static void main(String[] args) {
		/* 4.	Given an array of integers, return indices of the two numbers
		 *  such that they add up to a specific target, you may assume
		 *   that each input would have exactly one solution and you may not use the same element twice. */

       int arr[]={2,7,2,9,7,2,2,11,2,9,2};
       int target=9;
       int freq[]=new int[arr.length];
       int[] arr1=new int[arr.length];
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
      /*  for (int i = 0; i < arr.length; i++) {
        	int count=1;
        	for (int j = i+1; j < arr.length; j++) {
            	if(arr[i]==arr[j]) { //2==7 2==2
            		count++; //4
            		freq[j]=-1;  //4 1 -1 1 -1 1 -1
            		
			}
        	}
        	if(freq[i]!=-1) {
        		freq[i]=count;
        	}
        }
        for (int i = 0; i < arr.length-1; i++) {//0 1
        if(freq[i]>=1){ 
        	//System.out.println(arr[i]);
        	
			arr1[i]=arr[i];
         }	
        }	
     for (int i = 0; i < arr1.length-1; i++) {
                System.out.print(arr1[i]+" ");
                
                // if(arr1[i]+arr1[i+1]==target)
                //	 System.out.println(i+" "+(i+1));
                }*/
	}

	
	}

