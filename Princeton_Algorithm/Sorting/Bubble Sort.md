### 冒泡排序(复杂度 O(n^2))
* 样例

    ![enter image description here](https://assets.toptal.io/assets/front/static/public/blocks/sorting_algorithms/animations/50/random-initial-order/bubble-sort_ee720b.gif)
* 基本概念

    冒泡排序通过每次对需要排序的item的每一个相邻项进行比较，若前一个比后一个大，则进行交换。通过这个操作，每一趟排列可以将item中的最大值置于最高位，在经过n-1趟循环之后，排列结束

```java
public class BubbleSort {
    public static void bubbleSort(int[] data){
        //总共外部循环需要n-1次，每次迭代排序数组需要n-1次
        //同时需要考虑数据交换
        //冒泡排序每经过一次外层循环都可以把最高位归位
        int temp;
        for (int j=0; j<=data.length-1; j++){
            for (int i=1; i<=data.length-1-j; i++){
                if (data[i-1]>data[i]){
                    temp = data[i-1];
                    data[i-1] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
}
```
