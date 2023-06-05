// this class stores information about periuem car types
public class PremiumCar extends Car {
    double INSURANCERATE = 0.05;
    public PremiumCar(String carName,double carRate){

    }
    @Override
    public double getCarRate() {
        return carRate;
    }
}
