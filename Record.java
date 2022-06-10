
/*6.	Programming Challenges Question - 1
Write a program that accepts 10 student records (roll number and score) and
 prints them in decreasing order of scores. 
 In case there are multiple records pertaining to the same student,
 the program should choose a single record containing the highest score. 
 The program should be capable of accepting a multi-line input. 
 Each subsequent line of input will contain a student record, that is,
  a roll number and a score (separated by a hyphen).
   The output should consist of the combination of roll number and 
   corresponding score in decreasing order of score.
INPUT to program

1001-40
1002-50
1003-60
1002-80
1005-35
1005-55
1007-68
1009-99
1009-10
1004-89
*/

package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Record {
	public static void main(String[] args) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the students ID and Mark: ");
	for(int i=0;i<3;i++) {
		str=sc.nextLine();
		String[] str1=str.split("-");
		int k = Integer.valueOf(str1[0]);	//1001
		//System.out.println(k);
		if(hm.containsKey(k)) {//check if 1001 is present r not
			int value = hm.get(k);//1001-4
			if (value < Integer.valueOf(str1[1])) {
			hm.put(k, Integer.valueOf(str1[1]));
			}
		} else {
			hm.put(k, Integer.valueOf(str1[1]));
		}
	}
		List<Integer> values = new ArrayList(hm.values());

		Collections.sort(values);
	

		List<Integer> keys = new ArrayList(hm.keySet());

		for (int j = values.size() - 1; j >= 0; j--) {

			for (Integer key : keys) {
				if (hm.get(key) == values.get(j)) {
					System.out.println(key + "-" + values.get(j));
				}

			}

		}

	}

			
	}		
		
		
