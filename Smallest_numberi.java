package pailagam;

public class Smallest_numberi {
	public static void main(String[] args) {
		largest();
		asecnding();
		desecnding();
		smallest();
	}
	public static void asecnding() {
		int arr[]= {60,10,50,20,30,40};int count=0;
		for (int i = 0; i < arr.length; i++) {//0 1
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) { //60>10 10>50 10>20 10>30 10>40  60>50  50>20  60>50
				count=arr[i];// 60 60 50
				arr[i]=arr[j];//10 50 20
				arr[j]=count;//60 60 50
				}//10 20 30 40 50 60
			}
			}
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
			 System.out.println();
		}
		}
	

		public static void desecnding() {
		int arr[]= {10,20,30,40,50,60};int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) //0<1 0<2 0<3 0<4
				count=arr[i];//10 20 30 
				arr[i]=arr[j];//20 30 40
				arr[j]=count;//10 20 30
				//60 10 20  30 40  50
			}}
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
			 System.out.println();
		}}
		public static void smallest() {
			int arr[]= {10,20,30,40,50,60,5};int small=Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
					if(small>arr[i]) //100>10 10>20 10>30
					small=arr[i];//10
				}
				 System.out.println(small);
			
		}
		public static void largest() {
			int arr[]= {10,20,30,40,50,60,5};int small=Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
					if(small<arr[i]) //100>10 10>20 10>30
					small=arr[i];//10
				}
				 System.out.println(small);
			
		}

}