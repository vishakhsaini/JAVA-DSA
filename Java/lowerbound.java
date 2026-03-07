import java.util.*;
public class lowerbound {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int ans = n;
        int t = s1.nextInt();
        int arr[] = new int[n];
        int lo = 0;
        int hi = arr.length-1;
        for(int i = 0 ; i<n ; i++){
            arr[i] = s1.nextInt();
        }
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=t){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
