import java.util.*;
interface Car{
    void engine();
    default void start(){
        System.out.println("Car starts.");
    }
    static void stop(){
        System.out.println("Car stops.");
    }
}
interface Bike{
    void engine1();
    default void start1(){
        System.out.println("Bike starts.");
    }
    static void stop1(){
        System.out.println("Bike stops.");
    }
}
class Vehicle implements Car,Bike{
    public void engine(){
        System.out.println("Car-");
    }
    public void engine1(){
        System.out.println("Bike-");
    }
}

    public class mulinheritance {
          public static void main(String[] args) {
            Vehicle obj = new Vehicle();
            obj.engine();
            obj.start();
            Car.stop();
            obj.engine1();
            obj.start1();
            Bike.stop1();
          }
}
