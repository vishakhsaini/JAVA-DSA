import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());
        String element = fruits.get(1);
        System.out.println("Element at index 1: " + element);
        fruits.remove(0);
        System.out.println("List after removal: " + fruits);
        System.out.println("New Size: " + fruits.size());
    }
}