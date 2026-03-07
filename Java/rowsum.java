import java.util.*;
public class rowsum{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt(); 
        int arr[][] = new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=s1.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
        for(int i=0;i<a;i++){
            int sum=0;
            for(int j=0;j<a;j++){
                sum = sum+arr[i][j];
                System.out.println(sum);
            }
        }
    }
}