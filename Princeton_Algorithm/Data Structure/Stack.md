## 数据结构篇

### 栈 Stack

#### Basic API of Stack
```java
public class Stack<Item> implements Iterable<Item>

Stack() //创建空栈

void push(Item item) //向栈中添加元素

Item pop() //从栈中删除最近添加元素

boolean isEmpty() 检测栈是否为空

int size() //栈中包含元素的数量
```
#### Stack的实现方式

* Linked_list

    * 定义： 链表是一种递归的数据结构，它可以为空(null)，也可以指向对一个节点的(node)的引用，该结点含有一个泛型元素和一个指向另一条链表的引用。 结点可作为任意数据类型的抽象实体。

#### stack push 的 linkedlist 实现

```java
inner class
private class Node{
    String item;
    Node next;
}
//对节点进行初始化
```
* Push 操作

    ![enter image description here](http://algs4.cs.princeton.edu/13stacks/images/linked-list-insert-front.png)

* Pop 操作

    ![enter image description here](http://algs4.cs.princeton.edu/13stacks/images/linked-list-remove-first.png)
