import java.util.Deque;
import java.util.LinkedList;

public class FilaDequeue {
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
