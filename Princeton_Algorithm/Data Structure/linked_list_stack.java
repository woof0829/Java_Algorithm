public class LinkedStackOfStrings{
    private Node first = null;
    // Initialize the first node of the linkedlist
    private class Node{
        String item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
        //judge if the stack is empty
    }
    public void push(String item){
        Node oldfirst = first;
        //将当前的首位赋值给临时的oldfirst
        first.item = item;
        //将压入stack的item复制给新的first
        first.next = oldfirst;
    }
    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }
}
