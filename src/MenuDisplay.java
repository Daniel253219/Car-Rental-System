import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

// this class displays cars available and asks a the usr if he or she wants to make a booking
public class  MenuDisplay {
    // displays cars
    public  int DisplayCarList(){
        System.out.println("Welcome to the car rental system!");
        System.out.println("");
        System.out.println("Car's available for booking below:");
        System.out.println("----------------------------------------------------------------------");
        try
        {
            int i = 0;
            Scanner scan = new Scanner(new File("Carlist.csv"));
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
                i++;
            }
            int totalcars = i-1;
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Total "+totalcars+" cars availiable");
            System.out.println("Note for Premium cars, there's an additional 5% insurance access applied");
            System.out.println("to the car rate.");
            System.out.println("*************************************************************************");
            System.out.println("Select one from the following options below.");
            System.out.println("");
            System.out.println("1. To make a booking");
            System.out.println("2. Exit the system");
            System.out.println("");
            return totalcars;
        }
        catch(Exception e){
            System.out.print("Cannot not find file exiting the system");
            System.exit(0);
        }
        return 0;
    }
    // asks usr if they want to make a booking
    public int getSelection(){
        try{
            //variables
            System.out.print("Enter your selection:");
            Scanner userinput = new Scanner(System.in);
            int userInput1 = userinput.nextInt();  // Read user input
            if(userInput1 == 1){
                return userInput1;
            }
            if(userInput1 == 2){
                System.out.println("System Exited");
                System.exit(0);
            }
            else {
                System.out.println("Invaild input");
                getSelection();
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input try again");
            getSelection();
        }
        return 0;
    }
}

