package Practice.Polymorphism.PolymorphismChallenge;

public class Car {

    String type;

    public Car(String type) {
        this.type = type;
    }

    public void startEngine() {
    }

    public void drive() {
    }

    protected void runEngine() {
    }

    public String getType() {
        System.out.println("Te car is: " + type);
        return type;
    }

    public static Car getCar(String type) {
        return switch (type.toUpperCase()){
            case "GAS"-> new GasPoweredCar(type);
            case "ELECTRIC"-> new ElectricCar(type);
            case "HYBRID"-> new HybridCar(type);
            default -> new Car(type);
        };
    }
}

class GasPoweredCar extends Car{

    public GasPoweredCar(String type){super(type);}

    double avgKmPerLitre;
    int cylinders;

    @Override
    public void startEngine() {

        super.startEngine();
        System.out.println("The car's engine sounds like fss");
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
class ElectricCar extends Car{

    double avgKmPerLitre;
    int batterySize;

    public ElectricCar(String type) {
        super(type);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                "} " + super.toString();
    }
}

class HybridCar extends Car{

    double avgKmPerLitre;
    int batterySize;

    int cylinder;

    public HybridCar(String type) {
        super(type);
    }

    @Override
    public void startEngine() {

        super.startEngine();

    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }

    }
