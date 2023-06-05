// this class prints booking details
public class PrintBookingDetails {
   public void printBookingdetails(Customer customer, CarBooking carBooking){
        System.out.println("");
        System.out.println("Thank you for your booking "+customer.getCustomerName());
        System.out.println("Email: "+customer.getCustomerEmail());
        System.out.println("Address:"+ customer.getCustomerAddress());
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Booking confirmed");
        System.out.println("");
        System.out.println("Here's your booking summary");
        System.out.println("--------------------------------------------");
        System.out.println("Car selected   "+carBooking.carName);
        System.out.println("Start date   "+carBooking.getStartDate());
        System.out.println("End date   "+carBooking.getEndDate());
        System.out.println("Total days booked   "+carBooking.getTotalDays());
        System.out.println("Car rate per day   "+carBooking.getNewRate());
        System.out.println("--------------------------------------------");
        System.out.println("Total cost   "+carBooking.getCost());
        System.out.println("--------------------------------------------");
        System.out.println("");
   }
}

