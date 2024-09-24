package OOPS.Inheritance.Questions;

/*
Single inheritance
*/

class Vehicle{
    private String model ;
    private int year;

    // parametrized constructor
    public Vehicle(String model, int year){
        this.model = model;
        this.year = year;
    }

    public void startEngine()
    {
        System.out.println("Vehicle starts engine");
    }

    public void stopEngine()
    {
        System.out.println("Vehicle stops engine");
    }

    public void vehicleDetails()
    {
        System.out.println("Model : " + model+"\n" + "Year : " + year);
    }
}

class Car extends Vehicle{

    private int fuelCapacity ;
    public Car(String model, int year, int fuelCapacity){
        super(model, year);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel()
    {
        System.out.println("Car refuels " + fuelCapacity);
    }
}


public class Single {
    public static void main(String[] args) {
        Car car = new Car("Car Model", 2019, 5);
        car.vehicleDetails();
        car.startEngine();
        car.stopEngine();
        car.refuel();
    }
}
