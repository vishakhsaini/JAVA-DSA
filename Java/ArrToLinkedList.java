import java.util.Scanner;
class Node {
    int a; Node next;
    Node(int a) {
        this.a = a;
        this.next = null;
    }
}
class ArrToLinkedList {
     static void reverseArr(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;  hi--;}
    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        } 
        if (n > 0) {
            Node head = new Node(arr[0]);
            Node curr = head;
            for (int i = 1; i < n; i++) {
                Node tmp = new Node(arr[i]);
                curr.next = tmp;
                curr = tmp;
            }
            curr = head;
            while (curr != null) {
                System.out.print(curr.a + ">>");
                curr = curr.next;
            }
        s.close();
    }
}
}