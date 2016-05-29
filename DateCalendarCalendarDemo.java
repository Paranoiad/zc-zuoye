package zuoye4;
import java.util.*;

public class DateCalendarCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,String> days=new HashMap<>();
			days.put(Calendar.MONDAY, "星期一猴子穿新衣");
			days.put(Calendar.TUESDAY, "星期二猴子肚子饿");
			days.put(Calendar.WEDNESDAY, "星期三猴子去爬山");
			days.put(Calendar.THURSDAY, "星期四猴子去考试");
			days.put(Calendar.FRIDAY, "星期五猴子去跳舞");
			days.put(Calendar.SATURDAY, "星期一六猴子去斗六");
			days.put(Calendar.SUNDAY, "星期天猴子乐翻天");
			
			Calendar calendar =Calendar.getInstance();
			int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
			System.out.println(days.get(dayOfWeek));
	}

}
