package zuoye4;
import java.util.*;
import java.text.*;
public class DateCalendarHowOld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			DateFormat dateFormat=
					new SimpleDateFormat("yyyy-mm-dd");
			
			System.out.println("������������գ�yyyy-mm-dd��");
			Date birth=dateFormat.parse(scanner.nextLine());
			Date current=new Date();
			long life=current.getTime()-birth.getTime();
			System.out.println("����������Ϊ��"+
					life/(365*24*60*60*1000L));
	}

}
