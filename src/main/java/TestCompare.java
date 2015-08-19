
import java.util.*;
import java.text.*;

public class TestCompare {
	
	public static void main(String [] args){
    	
 	   TestDate t1 = new TestDate();
 	   t1.setLastModifiedDate("02/04/2014");
 	   
 	   TestDate t2 = new TestDate();
 	   t2.setLastModifiedDate("02/02/2014");
 	   
 	   List tmpList = new ArrayList();
 	   tmpList.add(t1);
 	   tmpList.add(t2);
 	   
 	   System.out.println("Before : " + tmpList);
 	   
 	   Collections.sort(tmpList, byDate);
 	   
 	   Iterator i = tmpList.iterator();
 	   while(i.hasNext()){
 		   System.out.println("dt: " + ((TestDate)i.next()).getLastModifiedDate());
 	   }
 	  
	}
	
	public static final Comparator byDate = new Comparator() {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

	    public int compare(Object ord1, Object ord2) {
	    	TestDate td1=(TestDate)ord1;
	    	TestDate td2=(TestDate)ord2;
	    	
	        Date d1 = null;
	        Date d2 = null;
	        try {
	            d1 = sdf.parse(td1.getLastModifiedDate());
	            d2 = sdf.parse(td2.getLastModifiedDate());
	        } catch (ParseException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }


	    //    return (d1.getTime() > d2.getTime() ? -1 : 1);     //descending
	      return (d1.getTime() > d2.getTime() ? 1 : -1);     //ascending
	    }
	};


}
