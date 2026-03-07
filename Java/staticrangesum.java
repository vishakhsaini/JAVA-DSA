import java.util.*;
public class staticrangesum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int q = s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        int[] prefix = new int[n];
        for(int i= 0;i<=n; i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int i = 0;i<q;i++){
            int sum = 0;
            int a = s1.nextInt();
            int b = s1.nextInt();
            sum = prefix[a]-prefix[b-1];
            System.out.println(sum);
        }
    }
}
