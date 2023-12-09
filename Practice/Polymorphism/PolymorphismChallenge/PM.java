package Practice.Polymorphism.PolymorphismChallenge;

public class PM {
    public static void main(String[] args) {

        String type = "Gas";
       Car theCar = Car.getCar(type);
       theCar.startEngine();
       Car goodCar= new GasPoweredCar(type);
       goodCar.startEngine();




    }
}

