
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

// This class manages user selections of the car be hired, and the dates they would like to hire.
public class CarAndBookingDates {
    //Variables
    private int year;
    private int month;
    private int day;

    //Constructor
    public CarAndBookingDates(){
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    // asks usr what car they want
    public int carSelection(int carsAvailable ) {
        while(true){
            try {
                System.out.println("To make a booking:");
                System.out.print("     Select a car number from the car list:");
                Scanner userinput = new Scanner(System.in);
                int userInput1 = userinput.nextInt();  // Read user input
                if (userInput1 == 1) {
                    return userInput1;
                }
                if (userInput1 == 2) {
                    return userInput1;
                }
                if (userInput1 == 3) {
                    return userInput1;
                }
                if (userInput1 == 4) {
                    return userInput1;
                }
                if (userInput1 == 5) {
                    return userInput1;
                } else {
                    System.out.println("invaild selection");
                }
            }
            catch (Exception e) {
                System.out.println("invaild input");
            }
        }
    }
    public LocalDate getCarBookingFull(){
        return LocalDate.of(promptForYear(),promptForMonth(),promptForDay());
    }
    public int promptForYear(){
        try{
            System.out.print("     Please enter the year - for example '2021':");
            Scanner inputyear = new Scanner(System.in);
            year = inputyear.nextInt();  // Read user input
            validateForYear(year);
        }
        catch (Exception e){
            System.out.println("enter a number");
            promptForYear();
        }
        return year;
    }
    public int promptForMonth(){
        try{
            System.out.print("     Please enter the month - for example '6':");
            Scanner inputmonth = new Scanner(System.in);
            month = inputmonth.nextInt();  // Read user input
            validateForMonth(month);
        }
        catch (Exception e){
            System.out.println("enter a number");
            promptForMonth();
        }
        return month;
    }
    public int promptForDay(){
        try{
            System.out.print("     Please enter the day - for example '21':");
            Scanner inputday = new Scanner(System.in);
            day = inputday.nextInt();  // Read user input
            validateForDay(day);
        }
       catch (Exception e){
           System.out.println("enter a number");
           promptForDay();
       }
        return day;
    }
    public boolean validateForYear(int year){
            if(year < 2021){
                System.out.println("Enter a year greater than 2021");
                promptForYear();
            }
        return true;
    }
    public boolean validateForMonth(int month){
        if(month > 12 || month < 0){
            System.out.println("Invalid month try again ");
            promptForMonth();
        }
        return true;
    }
    public boolean validateForDay(int day){
        if(day > 30 || day < 0){
            System.out.println("Invalid day try again ");
            promptForDay();
        }
        return true;
    }
}
