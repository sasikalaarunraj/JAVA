/*
 * 9.	Write a program which will accept three sentences (one sentence per line) and
 print the words having Initial Caps within the sentences. Below is an example.

Input:
This is a Program Coding test of Initial Caps, the program Will Test You.

 */
package collection;
public class Finding_caps{
	public static void main(String[] args) {
		String str="This is a Program Coding test oF Initial Caps, the program Will Test You";
		String str1[]=str.split(" ");
		for (String string : str1) {
		    	if(Character.isUpperCase(string.charAt(0))){
			    		System.out.println(string);
			        }
		}
	}  
		    }

	


