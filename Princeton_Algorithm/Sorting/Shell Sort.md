### 希尔排序

* 样例

    ![enter image description here](http://img.blog.csdn.net/20140603195838281?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
* 基本思想

    Shell Sort的基本思想就是将数组中任意间隔为h的元素为有序的。这种类型的数组被称为h有序数组。换言之，一个h有序数组便是h个相互独立的有序数组相互结合在一起而形成的数组。见下图，同时在排序的时候，如果h的数值很大，我们便可以将元素移动到很远的地方，为了实现更小的h有序创造便利。

    ![enter image description here](http://algs4.cs.princeton.edu/21elementary/images/h-sorted.png)

```
    public class Shell{
        public static void sort(Comparable[] a){
            // 将a[]按升序排列
            int N = a.length;
            int h = 1;
            while(h < N/3) h = 3*h + 1;
            while(h >= 1){
                //讲数组变为h有序
                for(int i = h; i < N; i++){
                    //将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]当中
                    for(int j = i; i >= h && less(a[j], a[j-h]); j -= h)
                        exchange(a, j, j-h);
                    }
                    h = h/3;
                }
            }

        }       
```
