/*Binary search is an efficient algorithm for finding a target value within a sorted array or list. It operates on the principle of repeatedly dividing the search space in half.*/
import java.util.*;
public class binary{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();int t;
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr [i] = s1.nextInt();
        }
        int a = arr.length;
        int lo = 0;
        int hi = a-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>t)
        }
    }
}