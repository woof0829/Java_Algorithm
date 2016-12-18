## 归并排序

>复杂度(nlogn)

### 概念

>对于归并的概念，简而言之就是分治，对于独立的部分单独地进行排序然后再将排序完成的子数组进行合并，最终完成全部排序。但是归并排序由于需要额外数组，所以空间复杂度也比较高。

<!--more-->

![enter image description here](http://algs4.cs.princeton.edu/22mergesort/images/mergesort-overview.png)

* 样例

    ![enter image description here](https://assets.toptal.io/assets/front/static/public/blocks/sorting_algorithms/animations/50/random-initial-order/merge-sort_8993d8.gif)



### 分类

#### 原地归并的抽象方法
* Example:

    ![enter image description here](http://7xrsib.com1.z0.glb.clouddn.com/sortMerge-sort-example-300px.gif
)

* 原地归并为直接将两个不同的有序数组合并到第三个数组当中，当然该数组最终是有序的。原理：首先将原数组存放至一个临时数组当中，并通过指定参数如i和j指向数组的起始位置`low`和中间位置`middle`。以此保证了原数组左右两边是有序的。从左右两个独立数组的头部开始扫描数组，此时对`array[i]`和`array[j]`进行比较，将较大值放入临时数组。


* 抽象地描述便是`merge(a, low, middle, high)`，该方法会将`a[low..middle]`，`a[middle..high]`归并为一个有序的数组并将结果存放在`a[low..high]`当中。

```java
public class Merge{
    public static void merge(int[] data, int low, int middle, int high){
        int[] data_new = new int[data.length];
        int left = low, right = middle+1; // 定义双指针
        for (int i = 0; i <= data.length-1 ; i++ ) {
            data_new[i] = data[i];
        }
        for (int i = 0; i <= high; i++ ) {
            if (i > middle) data[i] = data_new[right++];
            else if (j > high ) data[i] = data_new[left++];
            else if (data_new[left] < data_new[right]) data[i] = data_new[left++];
            else data[i] = data_new[right++];
        }
    }
}
```
#### 自顶向下归并排序

自顶向下排序实现了一种递归归并的方法， 实现了一种典型的分治思想，运用迭代的思想将两个独立的子数组进行排序，并最终完成归并；对于一个长度为N的任意数组， 自顶向下归并排序需要进行1/2NloN到NlgN的比较

![enter image description here](http://algs4.cs.princeton.edu/22mergesort/images/mergesortTD.png
)

```java
public void mergeSort(int[] data, int low, int high){
    if (high <= low) return;//此种情况结束递归，即无法再继续进行分割
    int middle = low + (high - low)/2;
    sort(data, low, middle);//对数组左半部分进行排序
    sort(data, middle+1, high);//对右半部份进行排序
    merge(data, low, middle, high);//不断进行递归，直到无法继续进行直到结束
}
```

##### 优化方式

* 对于规模较小的子数组使用插入排序

 由于归并排序中频繁的使用了递归的方式进行操作，操作过程中对于一些小规模的数组，可以先对其进行插入排序，因为对于子数组(长度小于15)的排序，插入排序的效率会更高一些，运行时间一般可以缩短10%到15%。

* 测试数组是否已经有序

    在merge之前先对数组进行判断是否已经有序，如果有序则直接跳过merge步骤
    ```java
    if (!data[i+1] < data[i] ) {
        return;
    }
    ```
