## Princeton- Algorithm
1st week：Union-Find
#### 问题描述
有N个元素，从0-N-1编号，假如两个元素之间的连接视为通路，当执行多次任意的两个元素之间的连接之后，如何判断两个元素能够经由已有路径相连通。对于连接的动作称为union，判断是否连接的操作称为find，如下图
![enter image description here](http://img.blog.csdn.net/20130901114328078)

从上图中可以看出，0, 1, 2, 5, 6, 7 中的任意两个元素都是相连的，同样 3, 4, 8, 9 中任意两个元素也是互连的，但是第一个集合和第二个集合的元素却是无法连通的。

实际操作中可用于在一个庞大的网路环境下，如何迅速判断某两个点是否相连，如下图：

![enter image description here](http://img.blog.csdn.net/20130901115026234)

####有效算法的开发步骤
1. 构建需求模型
2. 寻找所需算法
3. 运行算法检测速度和内存是否符合要求
4. 效率差或者达不到要求，找出问题的原因
5. 寻求解决办法，循环上述步骤直到满意为止

####首先确认Union和Find操作应该满足怎样的条件：
find操作：确认两个对象是否连接：
自反性：P连接到Q
对称性：P连接到Q，则 Q连接到P
传递性：P连接到Q，Q连接到R，则P也连接到R

union操作：连接在一起的对象，我们统称为一个连接集合，执行一次union操作就相当于将两个对象所在的集合连接到一起，组成一个新的集合。新集合中的任意两个成员也应该都处于连接状态。
####Connected Component
Concept: 相连的节点所构成的集合

![enter image description here](http://img.blog.csdn.net/20140531203442953?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

![enter image description here](http://img.blog.csdn.net/20140531203442953?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
