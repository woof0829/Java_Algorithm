## 二叉树

### 定义

>二叉树是一个连通的无环图，每个顶点的度都最多不会超过3，每个顶点都定义了一个父节点以及其对应的两个子节点

### 类型

一棵深度为K，同时含有2^k-1个节点的二叉树，被称为满二叉树，这种树每一层的节点数都是最大节点数。在一棵二叉树当中，除最后一层之外，其余每层都是满的。具有n个节点的完全二叉树的深度为log2n+1，深度为k的完全二叉树至少有2^(k-1)个节点，至多有2^k-1个节点。

![](https://www.tutorialspoint.com/data_structures_algorithms/images/binary_tree.jpg)

### 实现

二叉树的每个节点最多只含有两个子节点，在声明当中节点就是由元素的信息加上两个到其他节点的引用(left and right)的结构

```java
public class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
}
```
