import java.util.Scanner;
public class SubSetPrint{
    static String str;
    static void Subsets(String curr, int i) {
        if (i == str.length()) {
            System.out.println(curr);return;
        }
        Subsets(curr + str.charAt(i), i+ 1);
        Subsets(curr, i+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        s.close();
        Subsets("", 0);
    }
}