package pailagam;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class array_linked {
	public static void main(String[] args) {
	int target=9;
	 Set<Integer> hs = new HashSet<Integer>();
     hs.addAll(Arrays.asList(
             new Integer[] {2,7,2,9,7,2,2,11,2,9,2 }));
     Integer[] myArray = new Integer[hs.size()];
     hs.toArray(myArray);
     for(int i=0; i<myArray.length-1; i++){
    	 if(myArray[i]+myArray[i+1]==target) {
    		 System.out.println(i+ "  "+(i+1));
		  }
	  }
	  
     }
	}

