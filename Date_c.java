package pailagam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_c {

	public static void main(String[] args) {
		 String data[] = new String[2];
         InputStreamReader sr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(sr);
         for (int i = 0; i < 1; i++) 
         {
             try {
				data[i] = br.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
          int year=Integer.parseInt(data[i].split("-")[0]);
          int month=(Integer.parseInt(data[i].split("-")[1]))-1;
          int date=28;
          Calendar cal = Calendar.getInstance();
         cal.setTime(new Date());
         int year1=cal.get(Calendar.YEAR);
         int month1=cal.get(Calendar.MONTH);
         int date1=cal.get(Calendar.DATE);
         
         System.out.println(year1+" "+month1+" "+date1);
         int y=Math.abs(year1-year);
		int m=Math.abs(month-month1);
		float d=Math.abs(date1-date);
       int n=y/4; 
       float n2=(n*366)+(y-n)*365;
       double m5=(m)*30.4;
       int n3=(int) (n2+m5+d);
       int n4=n3%7;
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
       }
        
	}

}
}
