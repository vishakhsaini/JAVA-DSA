import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        for(int i=1;i<=n;i++){
             int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
               count ++;
                }}
        
                if(count<=2){
                   System.out.println(i);
                }
                }
        }
    }

