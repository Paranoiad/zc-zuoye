package zuoye4;
import java.util.*;

public class DateCalendarCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,String> days=new HashMap<>();
			days.put(Calendar.MONDAY, "����һ���Ӵ�����");
			days.put(Calendar.TUESDAY, "���ڶ����Ӷ��Ӷ�");
			days.put(Calendar.WEDNESDAY, "����������ȥ��ɽ");
			days.put(Calendar.THURSDAY, "�����ĺ���ȥ����");
			days.put(Calendar.FRIDAY, "���������ȥ����");
			days.put(Calendar.SATURDAY, "����һ������ȥ����");
			days.put(Calendar.SUNDAY, "����������ַ���");
			
			Calendar calendar =Calendar.getInstance();
			int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
			System.out.println(days.get(dayOfWeek));
	}

}
