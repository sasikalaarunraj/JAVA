/*8.	Write a program which will take the year (yyyy) and the numeric sequence of the
 *  month (0- 11) as its input. The program will return the day on which the
 *   28th of that particular month and year falls. The input can consist of 
 *two year-month combinations, one combination per line.

The numeric sequence of months is as follows: 0 – Jan
1	– Feb
2	– March and so on......

The format for supplying the input is: 1999-5
 
Where 1999 is the year and 5 is the numeric sequence of the month (corresponding to June).
 The program should display the day on which June 28, 1999 fell, and
  in this case the output will be MONDAY.

The output should be displayed in uppercase letters.
Suppose the following INPUT sequence is given to the program: 1999-5
1998-6

Then the output should be:
MONDAY TUESDAY

*/

package collection;
import java.util.Calendar;  
import java.util.Scanner;  
public class Date_calculation {
	public String daysofweek(int day,int month,int year) {
		Calendar c=Calendar.getInstance();//28-05-2022
		c.set(year,month-1,day);
		String[] days=new String[] {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		int n;
		n=c.get(c.DAY_OF_WEEK);
		return(days[n-1]);
		
	}
	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the date dd:mm:yyyy: ");
		str=sc.nextLine();
		int day=Integer.parseInt(str.substring(0,2));
		int month=Integer.parseInt(str.substring(3,5));
		int year=Integer.parseInt(str.substring(6,10));
		Date_calculation obj=new Date_calculation();
		System.out.println(obj.daysofweek(day,month,year));
	    		
	}  
	}  
	


