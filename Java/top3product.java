import java.util.*;
public class top3product{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = s1.nextInt();
        } 
        Arrays.sort(arr);
        int prod1 = arr[0]*arr[1]*arr[n-1];
        int prod2 = arr[n-1]*arr[n-2]*arr[n-3];
        int max_prod = Math.max(prod1,prod2);
        System.out.println(max_prod);
    }
}
