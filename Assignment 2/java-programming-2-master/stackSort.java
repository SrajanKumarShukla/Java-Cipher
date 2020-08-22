package assignment;
import java.util.*;
class stackSort {
    public static Stack<Integer> s(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!input.isEmpty()){
            int temp = input.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        Stack<Integer> tempStack = s(input);
        System.out.println("Sorted numbers are:");
        while (!tempStack.empty()) {
            System.out.print(tempStack.pop()+" ");
        }
    }
}