import java.util.*;
public class subarray2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s1.nextInt(); 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i;k<j;k++){
                    System.out.println(arr[k]+",");
                }
                System.out.println();
            }
        }
    }
}
