import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestCheckDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("20012-10-4 10:15:25");
		Date date2 = sdf.parse("2013-10-4 10:15:25");

		if(date1.equals(date2)){
		    System.out.println("Both are equals");
		}
		*/
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		String dueDateString = "10/03/2015";
		Calendar todayCal = Calendar.getInstance();
		String todayStr = df.format(todayCal.getTime());
		System.out.println("todayStr:"+todayStr);
		System.out.println("todayCal:"+todayCal);
		
		Date todayDate = df.parse(todayStr);
		System.out.println("todayDate:"+todayDate);
		
		Date dueDate = df.parse(dueDateString);
		System.out.println("dueDate:"+dueDate);
		
		System.out.println("compare:"+dueDate.compareTo(todayDate));
		
		/*if(dueDate.before(todayDate)){
			System.out.println("before date");
		}
		
		if(dueDate.after(todayDate)){
			System.out.println("after date");
		}
		
		if(dueDate.equals(todayDate)){
			System.out.println("same date");
		}
		*/

	}

}
