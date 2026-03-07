import java.util.Collection;
import java.util.ArrayList;
public class generic<T> {
    private T value;
    public generic(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static <E> void printCollection(Collection<E> collection) {
        for (E element : collection) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        
    }
    