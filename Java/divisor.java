import java.util.*;
public class divisor{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=1;i*i<=n;i++)
            if(n%i==0){
                System.out.pintln(i);
                System.out.println(n/i);
            }
        }
    }
}