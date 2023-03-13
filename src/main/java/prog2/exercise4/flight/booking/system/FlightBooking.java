package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

import javax.xml.validation.Validator;

import java.util.random;

public class FlightBooking {
    private String flightCompany="Flights-of-Fancy";
    //private String tripSource="NANJIN";
    //private String sourceAirport="NANJIN LUKOU INTERNATIONAL AIRPORT";
    //private String tripDestination="OULU",destinationAirport="OULU AIRPORT";
    private String flightID,passengerFullName,ticketNumber;
    //private LocalDate departingDate,returnDate;
    private int childPassengers,adultPassengers,totalPassengers;
    private double departingTicketPrice,returnTicketPrice,totalTicketPrice;
    public FlightBooking(String passengerFullName,LocalDate departureDateString,LocalDate returnDateString,int childPassengers,int adultPassengers){
        this.passengerFullName=passengerFullName;
        this.departureDate=departureDateString;
        this.returnDate=returnDateString;
        this.childPassengers=childPassengers;
        this.adultPassengers=adultPassengers;
    }
    public void setFlightID(String flightID){
        this.flightID=flightID;
    }
    public void setPassengerFullName(String passengerFullName){
        this.passengerFullName=passengerFullName;
    }
    public void setDepartureDate(LocalDate departingDate){
        this.departureDate=departureDate;
    }
    public void setReturnDate(LocalDate returnDate){
        this.returnDate=returnDate;
    }
    public void setChildPassengers(int childPassengers){
        this.childPassengers=childPassengers;
    }
    public void setAdultPassengers(int adultPassengers){
        this.adultPassengers=adultPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
        this.totalPassengers=childPassengers+adultPassengers;
    }
    //public void setTotalTicketPrice(double  TotalTicketPrice){
    //    this.totalTicketPrice=totalTicketPrice;
    //}
    public void setTicketNumber(String string) {
        this.ticketNumber=ticketNumber;
    }
    //public void setTripSource(String tripSource) {
    //    this.tripSource=tripSource;
    //}
    // public void setTripDestionation(String tripDestionation) {
    //     this.tripDestination=tripDestination;
    // }
    public void setFlightCompany(String flightCompany) {
        this.flightCompany=flightCompany;
    }
    public String getFlightCompany(){
        return flightCompany;
    }
    public String getFlightID(){
        return flightID;
    }
    public String getPassengerFullName(){
        return passengerFullName;
    }
    //public String getTripSource(){
    //    return tripSource;
    //}
    //public String getSourceAirport(){
    //    return sourceAirport;
    //}
    //public String getTripDestination(){
    //    return tripDestination;
    //}
    //public String getDestinationAirport(){
    //    return destinationAirport;
    //}
    public String getTicketNumber(){
        return ticketNumber;
    }
    public LocalDate getDepartingDate(){
        return departingDate;
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }
    public int getChildrenPassengers(){
        return childPassengers;
    }
    public int getAdultPassengers(){
        return adultPassengers;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }
    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public double getTotalTicketPrice(){
        return totalTicketPrice;
    }

    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
               flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
               "Ticket Number: " + ticketNumber + "\n" + 
               "From " + tripSource + " to " + tripDestination + "\n" +
               "Date of departure: " + departingDate + "\n" +
               "Date of return: " + returnDate + "\n" +
               "Total passengers: " + totalPassengers + "\n" +
               "Total ticket price in Euros: " + totalTicketPrice;
    }
    private BookingClass bookingClass;
    public enum BookingClass{
        FIRST,BUSINESS,ECONOMY;
    }
    public void setBookingClass(String bookingClass){
    switch(bookingClass){
        case "1":
        this.bookingClass=BookingClass.FIRST;
        break;
        case "2":
        this.bookingClass=BookingClass.BUSINESS;
        break;
        case "3":
        this.bookingClass=BookingClass.ECONOMY;
        break;
        default:
        System.out.println("Invaild choice");
        break;
    }
   }
   public BookingClass getBookingClass(){
    return bookingClass;
   }

   private TripType tripType;
   public enum TripType{
    ONE_WAY,RETURN;
   }
   public void setTripType(String tripType){
    switch(tripType){
        case "1":
        this.tripType=TripType.ONE_WAY;
        break;
        case "2":
        this.tripType=TripType.RETURN;
        break;
        default:
        System.out.println("Invaild choice");
        break;
    }
   }
   public TripType getTripType(){
    return tripType;
   }

   private TripSource tripSource;
   public enum TripSource{
    NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
   }
   public void setTripSource(String tripSource){
    switch(tripSource){
        case "1":
        this.tripSource=TripSource.NANJING;
        break;
        case "2":
        this.tripSource=TripSource.BEIJING;
        break;
        case "3":
        this.tripSource=TripSource.SHANGHAI;
        break;
        case "4":
        this.tripSource=TripSource.OULU;
        break;
        case "5":
        this.tripSource=TripSource.HELSINKI;
        break;
        case "6":
        this.tripSource=TripSource.PARIS;
        break;
        default:
        System.out.println("Invaild choice");
        break;
    }
   }
   public TripSource getTripSource(){
    return tripSource;
   }

   private TripDestination tripDestination;
   public enum TripDestination{
    NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
   }
   public void setTripDestination(String tripSource,String tripDestination){
    switch(tripDestination){
        case "1":
        this.tripDestination=TripDestination.NANJING;
        break;
        case "2":
        this.tripDestination=TripDestination.BEIJING;
        break;
        case "3":
        this.tripDestination=TripDestination.SHANGHAI;
        break;
        case "4":
        this.tripDestination=TripDestination.OULU;
        break;
        case "5":
        this.tripDestination=TripDestination.HELSINKI;
        break;
        case "6":
        this.tripDestination=TripDestination.PARIS;
        break;
        default:
        System.out.println("Invaild choice");
        break;
    }
   }
   public TripDestination getTripDestination(){
    return tripDestination;
   }

   private String sourceAirport;
   public void setSourceAirport(String sourceAirport){
    if(tripSource==tripSource.NANJING){
        this.sourceAirport="Nanjing Lukou International Airport";
    }
    if (tripSource==tripSource.BEIJING){
        this.sourceAirport="Beijing Capital International Airport";
    }
    if (tripSource==tripSource.SHANGHAI){
        this.sourceAirport="Shanghai Pudong International Airport";
    }
    if (tripSource==tripSource.OULU){
        this.sourceAirport="Oulu Airport";
    }
    if (tripSource==tripSource.HELSINKI){
        this.sourceAirport="Helsinki Airport";
    }
    if (tripSource==tripSource.PARIS){
        this.sourceAirport="Paris Charles de Gaulle Airport";
    }
   }

   private String destinationAirport;
   public void setDestinationAirport(String destinationAirport){
    if(tripDestination==tripDestination.NANJING){
        this.destinationAirport="Nanjing Lukou International Airport";
    }
    if (tripDestination==tripDestination.BEIJING){
        this.destinationAirport="Beijing Capital International Airport";
    }
    if (tripDestination==tripDestination.SHANGHAI){
        this.destinationAirport="Shanghai Pudong International Airport";
    }
    if (tripDestination==tripDestination.OULU){
        this.destinationAirport="Oulu Airport";
    }
    if (tripDestination==tripDestination.HELSINKI){
        this.destinationAirport="Helsinki Airport";
    }
    if (tripDestination==tripDestination.PARIS){
        this.destinationAirport="Paris Charles de Gaulle Airport";
    }
   }

   String departureDateString="2023-03-04";
   LocalDate departureDate=LocalDate.parse(departureDateString);
   String returnDateString="2023-03-05";
   LocalDate returnDate=LocalDate.parse(returnDateString);
   public void setTripDate(int tripDate){
    long days=departureDate.toEpochDay()-returnDate.toEpochDay();
        if(days>=0 && days<1){
            LocalDate returnDate=departureDate.plusDays(2);
        } else(days>=1 && days<2){
            LocalDate returnDate=departureDate.plusDays(1);
        }
    }
    public int getTripDate(){
        return TripDate;
    }

    public void setReturnTicketPrice(){
        this.returnTicketPrice=returnTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
        this.DepartingTicketPrice=DepartingTicketPrice;
    }
    public void setReturnTicketPrice(int childPassengers,int adultPassengers){
        this.ReturnTicketPrice=ReturnTicketPrice;
    }
    public void setTotalTicketPrice(int childPassengers,int adultPassengers){
        this.TotalTicketPrice=Math.abs((((2*((300+(0.1*300))+(0.05*300)))+(5*((300+(0.1*300))+(0.05*300))))+250)*2);
    }

    public void setTicketNumber() {
    
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

    ConfirmationMessage ConfirmationMessage;
    enum ConfirmationMessage {
        CHANGE, NOTCHANGE;
    }
    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.ConfirmationMessage = ConfirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departingDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        returnDate + ")\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departingDate + "\n" +
                        "Date of return: " + returnDate + "\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n");

                break;
        }
    }
    public void setTotalPassengers(int totalPassengers, int totalPassengers2){
        this.totalPassengers=childPassengers+adultPassengers;
        }
        public int getTotalPassengers() {
            return totalPassengers;
        }

}





