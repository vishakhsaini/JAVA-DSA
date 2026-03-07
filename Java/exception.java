class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);}}
public class exception {
    public static void main(String[] args) {
        try {int age = 12;
            if (age < 18) {
                throw new InvalidException("Age cannot be negative!");}
            System.out.println("Valid age: " + age);} catch (InvalidException e) {
            System.out.println("Caught Exception: " + e.getMessage());}}}
