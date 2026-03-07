import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr[] = new int[n];int count = 1; 
        for(int i =0 ; i<n ; i++ ){
            arr[i] = s1.nextInt();
        }
        for (int i=0 ; i<n-1 ; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(count%2==0){
                    
                }
            }
        } 
    }
}
