abstract class vehicle{
    abstract void start();
    abstract void stop();
    void fuel(){
        System.out.println("fuel is about to end");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("car start");
    }
    public void stop(){
        System.out.println("car stops");
    }
}
class bike extends vehicle{
    public void start(){
        System.out.println("bike start");
    }
    public void stop(){
        System.out.println("bike stops");
    }
}
public class abstraction{
    public static void main(String[] args) {
        car s1 = new car();
        s1.start();
        s1.fuel();
        s1.stop();
        bike s2 = new bike();
        s2.start();
        s2.fuel();
        s2.stop();
    }
}
