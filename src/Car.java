// this class stores information about cars
public class Car {
    //variables
    double carRate;
    private  String carName;

    //constructor
    public Car(String carName,double carRate){
        this.carName = carName;
        this.carRate = carRate;
    }

    public Car() {
    }

    //Getters
    //gets the car rate
    public double getCarRate() {
        return carRate;
    }
    public String getCarName() {
        return carName;
    }
}

