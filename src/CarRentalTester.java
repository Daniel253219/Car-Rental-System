import java.time.LocalDate;
import java.util.Scanner;

public class CarRentalTester {


    public static void main(String[] args) {

    MenuDisplay menu = new MenuDisplay(); // displays menu to usr
    int carsAvailable = menu.DisplayCarList();  // displays cars avaliable and returns cars available as int
    menu.getSelection();  // returns int value
    CarAndBookingDates carAndBookingDates = new CarAndBookingDates();
    int carId = carAndBookingDates.carSelection(carsAvailable); // prompts usr for car selection returns int
    System.out.println("");
    System.out.println("Enter booking start date.");
    LocalDate startDate = carAndBookingDates.getCarBookingFull(); // prompts usr for input returns local date
        System.out.println("");
        System.out.println("Enter booking end date.");
    LocalDate endDate = carAndBookingDates.getCarBookingFull(); // promps usr for input returns local date
        while(endDate.isBefore(startDate)){
            System.out.println("Enter a date after the start date");
            System.out.println("");
            endDate = carAndBookingDates.getCarBookingFull();
        }
        CarBooking carBooking = new CarBooking(carId,startDate,endDate);
        carBooking.makeBooking();                    // uncomment here
        System.out.println("");
         //prompt usr for email, name and addr
        System.out.print("Your name:");
        Scanner usrname = new Scanner(System.in);
        String usrName1 = usrname.nextLine(); // stores usr usrname
        System.out.print("Your email:");
        Scanner usremail = new Scanner(System.in);
        String usrEmail1 = usremail.next();  // stores usr email
        System.out.print("Your address:");
        Scanner usraddr = new Scanner(System.in);
        String usrAddr1 = usraddr.nextLine(); // stores usr address
         //prompt over
        Customer customer = new Customer(usrName1,usrEmail1,usrAddr1);
        PrintBookingDetails printBookingDetails = new PrintBookingDetails(); // calls print object
        printBookingDetails.printBookingdetails(customer,carBooking); // prints booking details

    }

}
