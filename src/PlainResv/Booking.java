package PlainResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
      String passengerName;
      int plainNo;
      Date date;
      
      
      Booking(){
    	  
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("Enter name of passenger:  ");
          passengerName= scanner.next();
          System.out.println("Enter plain no:  ");
          plainNo = scanner.nextInt();
          System.out.println("Enter data dd-mm-yyyy");
          String dataInput = scanner.next();
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM=yyyy");
         try {
        	date = dateFormat.parse(dataInput);
         }catch(ParseException e) {
        	 e.printStackTrace();
         }
      }
          
      public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Plain>plains) {
      int capacity = 0;
      for (Plain plain : plains) {
    	  if(plain. getPlainNo() ==plainNo)
    		  capacity = plain. getCapacity();
    	  }
      
      int booked = 0;
      for (Booking b:bookings) {
    	  if(b.plainNo == plainNo && b.date.equals(date)) {
    		  booked++;
      }
      
      }
      
      return booked<capacity?true:false;
}
      }