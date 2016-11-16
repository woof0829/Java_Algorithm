### 选择排序
* 样例

    ![enter image description here](http://img.blog.csdn.net/20140602174917906?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvY2FpcGVpY2hhbzI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

* 基本概念

    在数组中查询最小的元素，然后将其与数组中的第一个元素进行交换。当数组的第一个元素为最小元素的时候(将其与自身进行交换)。下一步在其余元素中找到最小的元素，将其与数组中的第二个元素进行交换。循环往复，直到将整个数组进行了排序。基本概念就是在剩余元素当中寻找最小者。
* 复杂度

    对于选择排序来说，当数组长度为N, 其大约需要N^2/2次比较与N次交换

```
public class Selection{
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0; i < N; i++){
            int min = i;
            for (int j = i+1; j < N; j++){
                if (less(a[j], a[min])) min = j;
            }
            exchange(a, i, min);
        }
    }
}
```
