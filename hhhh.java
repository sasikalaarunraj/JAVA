package collection;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class hhhh {
	public static void main(String[] args) { LocalDate bday = LocalDate.of(1992, Month.OCTOBER, 29);
	LocalDate today = LocalDate.now(); 
	Period age = Period.between(bday, today); 
	int years = age.getYears();
	int months = age.getMonths(); 
	int days=age.getDays();
	System.out.println("number of years: " + years);
	System.out.println("number of months: " + months); 
	System.out.println("number of days: " + days);
	switch(days) {
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

	} }




