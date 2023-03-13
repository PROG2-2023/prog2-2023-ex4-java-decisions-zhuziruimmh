package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;


  
  public class FlightBooking 
  {
   private String PassengerFullName;
   private String FlightCompany;
   private double TotalTicketPrice;
   private int ChildPassengers;
   private int AdultPassengers;
   private int TotalPassengers;
   public TripDestination tripDestination;
   private  BookingClass bookingClass;
   



   private String TicketNumber;

   private LocalDate DepartureDate;
   private LocalDate ReturnDate;
   private String SourceAirport;
   private String DestinationAirport;
   private double DepartingTicketPrice;
   private double ReturnTicketPrice;
   private int TripDate;


   enum BookingClass
   {
   FIRST,BUSINESS,ECONOMY;
   }

   private TripType tripType;
   enum TripType
   {
    ONE_WAY, RETURN;
   }

   enum TripSource 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }
   
   enum Airport{
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
    SHANGHAI_PUDON_INTERNATIONAL_AIRPORT, OULU_AIRPORT,HELSINKI_AIRPORT,
    PARIS_CHARLES_DE_GAULLE_AIRPORT
    }

   enum TripDestination 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }

   public String getPassengerFullName()
   {return PassengerFullName;
   }
   public String getFlightCompany()
   {return FlightCompany;
   }
   public int getTotalPassengers()
   {return TotalPassengers;
   }
   public int getChildPassengers()
   {return ChildPassengers;
   }
   public int getAdultPassengers()
   {return AdultPassengers;
   }
   public void setPassengerFullName(String PassengerFullName)
   {this.PassengerFullName = PassengerFullName;
   }
   public void setFlightCompany(String FlightCompany)
   {this.FlightCompany = FlightCompany;
   }

//    public FlightBooking(String passengerFullName,LocalDate depart,LocalDate returnDate,int childPassengers, int adultPassengers)
//    {
//     this.PassengerFullName = passengerFullName;
//     setDepartureDate(depart);
//     setReturnDate(returnDate);
//     this.ChildPassengers = childPassengers;
//     this.AdultPassengers = adultPassengers;
//     setTotalPassengers(childPassengers,adultPassengers);
//     }

public FlightBooking(String a, LocalDate depart, LocalDate returnDate, int w, int e) 
   {
   this.PassengerFullName = a;
   this.departureDate = depart;
   this.returnDate = returnDate;
   this.ChildPassengers =w;
   this.AdultPassengers =e;
   } 

   
   public void setBookingClass(String bookingClass)
   {
   switch (bookingClass) 
    {

    case"1":
    this.bookingClass = BookingClass.FIRST;;
    break;
    
    case"2":
    this.bookingClass = BookingClass.BUSINESS;
    break;
    
    case"3":
    this.bookingClass = BookingClass.ECONOMY;
    break;
    default:
    System.out.println("choice again");
     }
   }
   public BookingClass getBookingClass()
   {
   return bookingClass;
   }


   public void setTripType(String tripType ) 
    {
    switch (tripType )
     {
      case "1":
      this.tripType = TripType.ONE_WAY;
      break;
      case "2":
      this.tripType = TripType.RETURN;
      break;
      default:
      System.out.println("choice again");
     }
    }
   public TripType getTripType()
   {
   return tripType;
   }
   
   
 
   

    public TripSource tripSource;
    public Airport sourceAirport;
    public Airport destinationAirport;
    public void setTripSource(String tripSource){
     switch(tripSource){
       case "1":
       this.tripSource=TripSource.NANJING;
       this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
       break;
       case "2":
       this.tripSource=TripSource.BEIJING;
       this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
       break;
       case "3":
       this.tripSource=TripSource.SHANGHAI;
       this.sourceAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
       break;
       case "4":
       this.tripSource=TripSource.OULU;
       this.sourceAirport=Airport.OULU_AIRPORT;
       break;
       case "5":
       this.tripSource=TripSource.HELSINKI;
       this.sourceAirport=Airport.HELSINKI_AIRPORT;
       break;
       case "6":
       this.tripSource=TripSource.PARIS;
       this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
       break;
       default:
       System.out.println("choose again");
       break;
     }
   }
   public TripSource getTripSource(){
    return tripSource;
  }

   public void setTripDestination(String tripSource , String tripdestination)
{
    if(sourceAirport.equals(destinationAirport))
    {
        System.out.println("choose again");
       
    }
    else
    {
    switch(tripdestination){
      case "1":
      this.tripDestination=TripDestination.NANJING;
      this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripDestination=TripDestination.BEIJING;
      this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripDestination=TripDestination.SHANGHAI;
      this.destinationAirport=Airport.SHANGHAI_PUDON_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripDestination=TripDestination.OULU;
      this.destinationAirport=Airport.OULU_AIRPORT;
      break;
      case "5":
      this.tripDestination=TripDestination.HELSINKI;
      this.destinationAirport=Airport.HELSINKI_AIRPORT;
      break;
      case "6":
      this.tripDestination=TripDestination.PARIS;
      this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
      break;
      default:
      System.out.println("choose again");
      break;
        }
    }
}



public LocalDate departureDate;
 public LocalDate returnDate;
 public void setDepartureDate(LocalDate departureDate)
 {
 String sdepart ="2023-03-04";
 this.departureDate=LocalDate.parse(sdepart);
 }
 
 public LocalDate getDepartureDate()
 {
 return departureDate;
 }
 
 public void setReturnDate(LocalDate returnDate)
 {
 
 this.returnDate=departureDate.plusDays(2);
 long i = departureDate.toEpochDay() - returnDate.toEpochDay();
   
   if(i>=0 && i<1)
   {
   this.returnDate=departureDate.plusDays(2);
   }   
   else if(i>=1 && i<2)
   {
   this.returnDate=departureDate.plusDays(1);
   } 
 }
 
 public LocalDate getReturnDate()
 {
 return returnDate;
 }


//  private double DepartingTicketPrice;
//  private double ReturnTicketPrice;

//  public void setTotalPassengers(int totalPassengers, int TotalPassengers) 
//  {
//   this.TotalPassengers = ChildPassengers + AdultPassengers;
//  }

//  public void setTotalTicketPrice() 
//  {
//   this.TotalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
//  }
//  int departingTicketPrice;int returnTicketPrice;
//  public void setDepartingTicketPrice(int child, int adult) 
//  {
//   this.DepartingTicketPrice = departingTicketPrice;
//  }
//  public void setReturnTicketPrice() 
//  {
//   this.ReturnTicketPrice = returnTicketPrice;
//  }


//  public double getDepartingTicketPrice() {
//     return DepartingTicketPrice;
// }

// public double getReturnTicketPrice() {
//     return ReturnTicketPrice;
// }

// public double getTotalTicketPrice() {
//     this.TotalTicketPrice = DepartingTicketPrice + ReturnTicketPrice;
//     return TotalTicketPrice;
// }


Random random=new Random();
 public String ticketNumber="11FASDFDOM";
 public void setTicketNumber() 
 {
  String ticketNumber = null;
  switch (tripType) {
      case ONE_WAY:
          ticketNumber = "11";
          break;
      case RETURN:
          ticketNumber = "22";
          break;
  }
  switch (bookingClass) {
      case FIRST:
          ticketNumber = ticketNumber + "F";
          break;
      case BUSINESS:
          ticketNumber = ticketNumber + "B";
          break;
      case ECONOMY:
          ticketNumber = ticketNumber + "E";
          break;
  }
  for (int i = 0; i < 4; i++) {
      char f = (char) ((random.nextInt(26) + 65));
      ticketNumber = ticketNumber + f;
  }
  this.ticketNumber = ticketNumber + "DOM";
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
}

public String getTicketNumber(){
  return ticketNumber;
}

private ConfirmationMessage confirmationMessage;
public enum ConfirmationMessage{
  CHANGE,NOTCHANGE;
}

public void setConfirmationMessage(String confirmationMessage) {
  switch (confirmationMessage) {
      case "1":
          this.confirmationMessage = ConfirmationMessage.CHANGE;
          System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                  "of your booking and the trip: \n" +
                  "Ticket Number: " + ticketNumber + "\n" +
                  "Passenger Name: " + PassengerFullName + "\n" +
                  "From TripSource to " + tripDestination + "\n" +
                  "Date of departure: " + departureDate + "\n" +
                  "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                  returnDate + ")\n" +
                  "Total passengers: " + TotalPassengers + "\n" +
                  "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                  "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                  "less than two days apart from your departure date");
          break;
      case "2":
          this.confirmationMessage = ConfirmationMessage.NOTCHANGE;
          System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                  "of your booking and the trip: \n" +
                  "Ticket Number: " + ticketNumber + "\n" +
                  "Passenger Name: " + PassengerFullName + "\n" +
                  "From TripSource to " + tripDestination + "\n" +
                  "Date of departure: " + departureDate + "\n" +
                  "Date of return: " + returnDate + "\n" +
                  "Total passengers: " + TotalPassengers + "\n" +
                  "Total ticket price in Euros: " + TotalTicketPrice + "\n");

          break;
  }

}

public void setTotalTicketPrice() {

    this.TotalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
}
public double getTotalTicketPrice(){
    return TotalTicketPrice;
}

private double departingTicketPrice;
private double returnTicketPrice;
public void setDepartingTicketPrice(int child , int adult){
    this.departingTicketPrice= departingTicketPrice+0;
}
public double getDepartingTicketPrice(){
    return departingTicketPrice;
}

public void setReturnTicketPrice()
{
    this.returnTicketPrice=returnTicketPrice+0;
}
public double getReturnTicketPrice()
{
    return returnTicketPrice;
}

public void setTotalPassengers(int i, int j) {
}
public String getTripDestination() {
    return null;
}
}


