/*import java.util.*;
public class uniquepair {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = s1.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1; j<n ; j++){
                System.out.print(arr[i]+",");
                System.out.println(arr[j]);
            }
        }
    }
}*/
import java.util.*;
public class uniquepair {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = s1.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1; j<n ; j++){
                for(int k  = j+1 ; k<n ; k++){
                    System.out.print(arr[i]+",");
                    System.out.print(arr[j]+",");
                    System.out.println(arr[k]);
                }
            }
        }
    }
}