package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        String departingDateString="2023-03-12";
        LocalDate departingDate=LocalDate.parse(departingDateString);
        String returnDateString="2023-03-14";
        LocalDate returnDate=LocalDate.parse(returnDateString);
        String random="FOF"+Math.random();
        String subString=random.substring(random.length()-4);
        String sourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT";
        String destinationAirport="OULU AIRPORT";
        FlightBooking fb=new FlightBooking("John Doe",departingDate,returnDate,1,3);
        fb.setPassengerFullName("Jhon Doe");
        //fb.setTicketNumber("NO076545");
        fb.setTripSource("NANJING");
        //fb.setTripDestionation("OULU");
        fb.setFlightCompany("Flight-of-Fancy");
        //fb.setDepartingDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));
        //fb.setTotalTicketPrice(6000);
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setTicketNumber();
        fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setDepartureDate(LocalDate.parse("2023-03-12"));
        fb.setReturnDate(LocalDate.parse("2023-03-14"));

    System.out.println("Dear " + fb.getPassengerFullName() + ". Thank you for booking your flight with " + 
    fb.getFlightCompany() + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + fb.getTicketNumber() + "\n" + 
    "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
    "Date of departure: " + fb.getDepartingDate() + "\n" +
    "Date of return: " + fb.getReturnDate() + "\n" +
    "Total passengers: " + fb.getTotalPassengers() + "\n" +
    "Total ticket price in Euros: " + fb.getTotalTicketPrice());
    } 
        
}
