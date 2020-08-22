package assignment;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueReverse {
    static Queue<Integer> queue;
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }
    static void reverseq()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args)
    {
        queue = new LinkedList<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        queue.add(55);
        queue.add(66);
        queue.add(77);
        queue.add(88);
        queue.add(99);
        queue.add(100);
        reverseq();
        Print();
    }
}
