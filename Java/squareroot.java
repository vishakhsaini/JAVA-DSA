import java.util.*;
public class squareroot{
    public static void main(String[] args) {
        Scanner s1 =  new Scanner(System.in);
        int n = s1.nextInt();
        int lo = 1;
        int hi = n;
        int ans = 0;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(mid*mid<=n){
            ans = mid;
            lo = mid+1;
        }else{
            hi = mid-1;
        }
    }
    System.out.println(hi);
}
}