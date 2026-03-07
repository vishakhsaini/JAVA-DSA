import java.util.*;
public class fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;} 
        else if (n == 1) {
            return 1;}
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);}
}
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int count = s1.nextInt();
        for (int i = 0; i < count; i++) {
            int result = fibonacci(i);
            System.out.print(result);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}
