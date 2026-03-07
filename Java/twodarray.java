import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        int a = s1.nextInt();
        int b  = s1.nextInt();
        int arr[][] = new int[a][b];
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ; j<b ; j++){
                arr[i][j] = s1.nextInt();
            }
        }
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ; j<b ; j++){
                System.out.print(arr[i][j]+ " ");
    }
    System.out.println("");
}
}
}
