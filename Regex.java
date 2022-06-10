/*5.	Sam wants to select a username in order to register on a website. The rules for selecting a username are:

1.	The minimum length of the username must be 5 characters and the maximum may be 10.
2.	It should contain at least one letter from A-Z or a-z
3.	It should contain at least one digit from 0-9
4.	It should contain at least one character from amongst @#*=
5.	It should not contain any spaces
6.	The first character should be an alphbet.

Write a program which accepts 4 usernames (one username per line) as input and checks whether each of them satisfy the above mentioned conditions.
If a username satisfies the conditions, the program should print PASS (in uppercase) If a username fails the conditions, the program should print FAIL (in uppercase)

If suppose the following usernames are given to the program, find the output: 1234@a
ABC3a#@
1Ac@ ABC 3a#@*/
 



package collection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name: ");
		for (int i=0;i<=4;i++) {
		Pattern p=Pattern.compile("^[A-Za-z](?=.*[0-9])(?=.*[a-z]|[A-Z])(?=.*[@#*=])(?=\\S).{5,10}");
		Matcher m=p.matcher(sc.nextLine());
		if(m.find()) {
			
			System.out.println("PASS");
			
		}
		else
			System.out.println("FAIL");
		}
		
	
	}
	}



