package pailagam;
public class Array_left_shift {
	public static void main(String[] args) {
		leftshift() ;
		rightshift();
	}

		public static void leftshift() {
		int arr[]= {10,20,30,40,50};int temp=0;
		int i=0;
		temp=arr[i];
		//System.out.println(temp);
		while(i<arr.length-1) {
			arr[i]=arr[i+1];//50
			i=i+1;
		}
		arr[i]=temp;	
			for(int k=0;k<=arr.length-1;k++) {
	        System.out.println(arr[k]);
		}
	}
		public static void rightshift(){
			int arr[]= {10,20,30,40,50};int temp=0;
			
			int i=arr.length-1,j=0;
			temp=arr[i];//50
			//System.out.println(temp);
			while(i>0) {//3<4
				arr[i]=arr[i-1];//[4]=[3]
				i=i-1;//[3]
			}
			arr[0]=temp;	
				for(int k=0;k<=arr.length-1;k++) {
		        System.out.println(arr[k]);
			}
		}	
		}


