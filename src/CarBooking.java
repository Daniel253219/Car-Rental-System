import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
//prompts the usr to make a booking
public class CarBooking {
    private LocalDate startDate;
    private LocalDate endDate;
    private int carNumber;
    private long totalDays;
    private double newRate;
    private double cost;
    private Car car;
    String carName;

    public CarBooking(int carNumber,LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.carNumber = carNumber;

    }
    public String toString()
    {
        return "startdate: "+this.startDate + "\nenddate: " + this.endDate + "\ncarid: " + this.carNumber;
    }
    // this calculates the cost of hire of the car selected
    public void makeBooking(){
        String carNumStr = Integer.toString(carNumber);
        ArrayList<String> lines = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(new File("CarList.csv"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.startsWith(carNumStr)){
                    lines.add(line);
                    if(line.startsWith("1")){
                        Car car1 = new Car("Mazda CX-9",150);
                        PremiumCar premiumCar = new PremiumCar(car1.getCarName(),car1.getCarRate());
                        newRate = premiumCar.INSURANCERATE*car1.getCarRate()+car1.getCarRate();
                        carName = car1.getCarName();
                        calculateTotalDays();
                        calculateCost(newRate,totalDays);
                        break;
                    }
                    if(line.startsWith("2")){
                        Car car1 = new Car("VW Golf",59);
                        newRate = 59;
                        carName = car1.getCarName();
                        calculateTotalDays();
                        calculateCost(car1.getCarRate(),totalDays);
                        break;
                    }
                    if(line.startsWith("3")){
                        Car car1 = new Car("Toyota Corolla",55);
                        PremiumCar premiumCar = new PremiumCar(car1.getCarName(),car1.getCarRate());
                        newRate = premiumCar.INSURANCERATE*car1.getCarRate()+car1.getCarRate();
                        carName = car1.getCarName();
                        calculateTotalDays();
                        calculateCost(newRate,totalDays);
                        break;
                    }
                    if(line.startsWith("4")){
                        Car car1 = new Car("VW Tiguan",110);
                        PremiumCar premiumCar = new PremiumCar(car1.getCarName(),car1.getCarRate());
                        newRate = premiumCar.INSURANCERATE*car1.getCarRate()+car1.getCarRate();
                        carName = car1.getCarName();
                        calculateTotalDays();
                        calculateCost(newRate,totalDays);
                        break;
                    }
                    if(line.startsWith("5")){
                        Car car1 = new Car("Ford Falcon",60);
                        newRate = 60;
                        carName = car1.getCarName();
                        calculateTotalDays();
                        calculateCost(car1.getCarRate(),totalDays);
                        break;
                    }
                    else{
                        System.out.println("no double");
                        break;
                    }
                }
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    // calculates day diffrence
    public void calculateTotalDays(){
        totalDays = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
    }
    // calculates car cost
    public void calculateCost(double newRate, long totalDays){
        cost = newRate*totalDays;

    }
    //Getters
    public LocalDate getStartDate() {return startDate;}
    public LocalDate getEndDate() {return endDate;}
    public int getCarNumber() {return carNumber;}
    public long getTotalDays() {return totalDays;}
    public double getNewRate() {return newRate;}
    public double getCost() {return cost;}
    public Car getCar() {return car;}

    //Setters
    public void setStartDate(LocalDate startDate) {this.startDate = startDate;}
    public void setEndDate(LocalDate endDate) {this.endDate = endDate;}
    public void setCarNumber(int carNumber) {this.carNumber = carNumber;}
    public void setTotalDays(long totalDays) {this.totalDays = totalDays;}
    public void setNewRate(double newRate) {this.newRate = newRate;}
    public void setCost(double cost) {this.cost = cost;}
    public void setCar(Car car) {this.car = car;}

}


