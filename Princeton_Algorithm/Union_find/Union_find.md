## Princeton- Algorithm
1st week：Union-Find
#### 问题描述
有N个元素，从0-N-1编号，假如两个元素之间的连接视为通路，当执行多次任意的两个元素之间的连接之后，如何判断两个元素能够经由已有路径相连通。对于连接的动作称为union，判断是否连接的操作称为find，如下图

![enter image description here](http://obpbs8a3y.bkt.clouddn.com/1.jpg)
![enter image description here](http://img.blog.csdn.net/20130901114328078)

从上图中可以看出，0, 1, 2, 5, 6, 7 中的任意两个元素都是相连的，同样 3, 4, 8, 9 中任意两个元素也是互连的，但是第一个集合和第二个集合的元素却是无法连通的。

实际操作中可用于在一个庞大的网路环境下，如何迅速判断某两个点是否相连，如下图：

![enter image description here](http://i2.piimg.com/567571/38bfecc955fdf85c.jpg)

#### 有效算法的开发步骤
1. 构建需求模型
2. 寻找所需算法
3. 运行算法检测速度和内存是否符合要求
4. 效率差或者达不到要求，找出问题的原因
5. 寻求解决办法，循环上述步骤直到满意为止

#### 首先确认Union和Find操作应该满足怎样的条件：
find操作：确认两个对象是否连接：
自反性：P连接到Q
对称性：P连接到Q，则 Q连接到P
传递性：P连接到Q，Q连接到R，则P也连接到R

union操作：连接在一起的对象，我们统称为一个连接集合，执行一次union操作就相当于将两个对象所在的集合连接到一起，组成一个新的集合。新集合中的任意两个成员也应该都处于连接状态。
#### Connected Component
Concept: 相连的节点所构成的集合

![enter image description here](http://img.blog.csdn.net/20140531203442953?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

![enter image description here](http://img.blog.csdn.net/20140531203442953?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
#### 操作
并查集提供了两种操作：
1. 查找操作(find)：检测两个节点是否相连
2. 合并操作(Union): 将两节点进行链接

#### 目标
并查集算法需要实现如下目标：
1. 查找对象的数量N可以非常大
2. 操作的次数M可以非常大
3. Find和Union操作可以随意调用


### Quick Find

#### 数据结构
假设有N个节点，该算法的数据结构为一个包含N个整数的数组id[]

#### Find操作
判断p q两个节点是否相连，通过判断id[p]和id[q]对应的数值是否一致

#### Union操作
将两节点合作是通过将被合并的节点q的id值设为节点p的id值

但是合并操作的缺点是在进行Union操作的时候，需要遍历整个数组，因此算法开销比较大

#### 复杂度
每一次合并的复杂度为N，当合并次数非常大的时候，趋近于N，运算的复杂度则为N^2,因此该算法不适合较大规模运算。

查找操作的复杂度为1.

### Quick Union(Lazy Approach)

#### 数据结构
1. 整型数组id[],大小为N
2. Interpretation: 数组的每个元素id[i]指的是i的上一级为id[i]
3. i的根节点 id[id[id[...id[]...]]]



#### Find操作

如果P和Q两个值对应相同的根节点，则为找到

#### Union操作

如果需要将p q进行连接，则需要将二者对应的根节点数设为相同值

![enter image description here](http://img.blog.csdn.net/20130901134321640)

#### 复杂度
在最坏的情况下，查找操作的复杂度仍将达到N

### Quick Union的优化
通过每个节点增加quality的概念，使得quality小的component位于大的component之下，从而避免了树形结构过高的问题。

如下图展示了树形结构深度优化后的效果
![enter image description here](http://img.blog.csdn.net/20140602174057171?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

#### 复杂度
合并操作的最坏复杂度为lgN,查询操作的最坏复杂度为lgN

##### 算法优化
在查找根节点时，将路径上的所有节点进行路径压缩，理论上得到的find操作的复杂度为1.
