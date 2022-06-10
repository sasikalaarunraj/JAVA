package collection;
import java.util.Scanner;
public class Date_calc {
	public enum Month { january,febrauary,march,april,may,june,july,august,september,october,november,december};
		
	
	public static void main(String[] args) {
		for (Month s : Month.values()){  
			System.out.println(Month.valueOf("s").ordinal());  
			}  
	
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the date mm:yyyy: ");
		str=sc.nextLine();
		int n,n3,n4;
	///String[] days=new String[] {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		int date=28;
		int month1=Integer.parseInt(str.substring(0,2));
		
		
		int year=Integer.parseInt(str.substring(3,7));
		System.out.println(month1+" "+year);
		/*String str1="29-05-2022";
		int day1=Integer.parseInt(str1.substring(0,2));
		int month1=Integer.parseInt(str1.substring(3,5));
		int year1=Integer.parseInt(str1.substring(6,10));
		int y=Math.abs(year1-year);
		int m=Math.abs(month-month1);
		float d=Math.abs(day1-day);
		
		
		
	//	if(month<month1) {
		int s1=y*12;
		int m2=s1-m;
		int y2=m2/12;//year
		float y3=m2%12;
		if(y2>=4) {
		n=y2/4;
        float n2=(n*366)+(y-n)*365;
        double m5=(y3)*30.4;
        n3=(int) (n2+m5+d);
        n4=n3%7;
        System.out.println(n4);
        }
        else {
        		n=y*365;
            double m5=(m)*30.4;
            n3=(int) (n+m5+d);
            n4=n3%7;
            System.out.println(n4);
        }
        switch(n4) {
        case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }*/
        

		
	}	
	}

	


