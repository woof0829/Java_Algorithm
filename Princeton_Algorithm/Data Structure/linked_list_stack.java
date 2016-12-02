public class Stack<Item> implements Iterable<Item>{
    private Node first;
    private int N;
    // Initialize the first node of the linkedlist
    private class Node{
        String item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
        //judge if the stack is empty
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        //将当前的首位赋值给临时的oldfirst
        first.item = item;
        //将压入stack的item复制给新的first
        first.next = oldfirst;
        N++;
    }
    public String pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
