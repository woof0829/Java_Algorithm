### 插入排序
* 样例

    ![enter image description here](http://img.blog.csdn.net/20140602175214796?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

* 基本概念

    该算法的主要思想是将数组进行分割，分别为已排序的部分和不可见 的不跟。每次从未排序的部分去除一个元素，置于已排序部分的最右侧，随之想做不断进行移动，直到遇到较小的元素停止

* 复杂度
    * 最好情况

    对于已经排序好的数组只需要验证是否完成排序即可，即需要N-1次比较，0次交换

    * 最差情况

    对于反序列数组，插入排序需要经过N^2/2次比较与N^2/2次交换才能完成

    ![enter image description here](http://img.blog.csdn.net/20140602175214796?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

```
public class Insertion{
    public static void sort(Comparable[] a){
        //将a[]按升序排列
        int N = a.length;
        for(int i = 1; i < N; i++){
            //将a[i]插入到a[i-1] a[i-2] a[i-3]当中
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--)
            exchange(a, j, j-1);
        }
    }
}
```
* 总结

    插值排序对于部分有序的数组是十分高效的，同时也适合规模较小的数组。

* 比较选择排序和插入排序
