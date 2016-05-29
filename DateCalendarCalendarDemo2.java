package zuoye4;
import java.util.*;
import static java.util.Calendar.*;
public class DateCalendarCalendarDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calendar rightNow=Calendar.getInstance();
			
			System.out.println("现在时间是：");
			System.out.printf("%s%d %n", rightNow.getDisplayName(ERA, LONG, Locale.TAIWAN),
					rightNow.get(YEAR));
			System.out.println(
					rightNow.getDisplayName(MONTH, LONG, Locale.TAIWAN));
			System.out.printf("%d 日%n", 
					rightNow.get(DAY_OF_MONTH));
			System.out.println(
					rightNow.getDisplayName(DAY_OF_WEEK, LONG, Locale.TAIWAN));
	}

}
