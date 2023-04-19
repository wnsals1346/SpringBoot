import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Object> list = new Stack<>();
        list.add(1);
        int size = Counter.sizeOf(list);
        System.out.println(size);
    }
}
class Counter {
    static int sizeOf(List<?> items) {
        return items.size();
    }
}