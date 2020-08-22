public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printNthFromLast()
    {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < 4)
            return;
        temp = head;
        for (int i = 1; i < len - 4 + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.printNthFromLast();
    }
}
