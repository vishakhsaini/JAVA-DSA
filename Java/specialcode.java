import java.util.*;
public class specialcode {
    public static int lowerbound(int[] arr , int t){
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static int upperbound(int arr[],int t){
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= t) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static int lastoccurance(int arr[],int t){
        int idx = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == t) {
                idx = mid;       // store result
                low = mid + 1;   // search right side for last
            } else if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return idx;
    }
}
    
    public static void main(String[] args) {
        
    }
    
