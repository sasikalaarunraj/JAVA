package collection;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.TimeUnit;
public class Date_1 {
		    public static void main(String[] args) throws Exception {
		        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		        Date firstDate = sdf.parse("10/29/1992");
		        Date secondDate = sdf.parse("05/30/2022");
		        long diff = secondDate.getTime() - firstDate.getTime();
		        TimeUnit time = TimeUnit.DAYS; 
		        long diffrence= time.convert(diff, TimeUnit.MILLISECONDS);
		        System.out.println(diffrence);
		        int diff1=(int) (diffrence%7);
		       System.out.println(diff1);
		        switch(diff1) {
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
