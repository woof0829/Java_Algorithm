### Queue(Based on LinkedList)

>队列数据结构可以表示为一条从最早插入的元素到最近插入的元素就的链表， 实例变量first指向队列开头，
实例变量Last指向队列末尾。 因此，如果一个元素需要进入队列(enqueue())，该元素就需要被添加到队列的末尾(当链表为空时, first和last均需要指向新结点); 如果需要将一个元素弹出队列(dequeue())，队列的首位元素便需要被删除。

```java
public class Queue<Item> implements Iterable<Item>{
    private Node first;//指向首结点
    private Node last;//指向队尾结点
    private int N;
    private class Node{
        //定义内部类
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        //向队尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            //如果队列为空
            first = last;
        }else{
            oldlast.next = last;
        }

    }
    public Item dequeue(){
        if (isEmpty()) {
            last = null;
        }
        Item item = first.item;
        first = first.next;
        //queue的首位指向下一个元素
        N--;
        return Item;
    }
}
```
