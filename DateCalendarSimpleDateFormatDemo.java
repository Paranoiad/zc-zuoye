package zuoye4;
import java.text.*;
import java.util.*;
public class DateCalendarSimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DateFormat dateFormat=
					new SimpleDateFormat("EE-MM-dd-yyyy",Locale.TAIWAN);
			System.out.println(dateFormat.format(new Date()));
	}

}
