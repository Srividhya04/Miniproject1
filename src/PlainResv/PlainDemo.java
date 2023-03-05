package PlainResv;
import java.util.Scanner;
import java.util.ArrayList;
public class PlainDemo {

	public static void main(String[] args) {
		
		ArrayList<Plain> plains = new ArrayList<Plain>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		plains.add(new Plain(1,true,2));
		plains.add(new Plain(2, true,10));
		plains.add(new Plain(3, false,15));
		
		
		int userOPt = 1;{
		Scanner scanner = new Scanner(System.in);
		
		for (Plain p:plains) {
			p.displayPlainInfo();
		}
		
		
		while(userOPt == 1) {
        System.out.println("Enter 1 to Book and 2 to Exit");
        userOPt = scanner.nextInt();
        if(userOPt == 1) {
        	Booking booking = new Booking();
        	if(booking.isAvailable(bookings,plains)) {
        		bookings.add(booking);
        		System.out.println("Your booking is confirmed");
        		
        	}
        	else
        		System.out.println("Sorry, plain is Full. Try another Plain or date.");
        }
	}
        
		}
	}
}