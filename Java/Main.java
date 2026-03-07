class Vehicle {
    int speed = 90;
    Vehicle(){
        System.out.println("Vehicle constructor is called");
    }
    void displayDetails(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    int speed = 120;
    Car(){
        super();
        System.out.println("Car constructor is called");
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("This is a car");
    }
    void showSpeed(){
        System.out.println("Speed:  "+speed);
    }
}

public class Main{
    public static void main(String[] args) {
        Car c = new Car();
        c.showSpeed();
        c.displayDetails();
    }
}