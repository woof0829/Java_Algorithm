import java.util.ArrayList;

public class JavaArrayLists {

    public static void main(String[] args) {
        ArrayList<String> myArraylist=new ArrayList<>();
        myArraylist.add("woof");
        System.out.println(myArraylist);
        myArraylist.add("hehe");
        System.out.println(myArraylist);
        //Arraylist遍历
        for (int i=0;i<myArraylist.size();i++){
            System.out.println(myArraylist.get(i));
        }
        //遍历方法2
        for (String item:myArraylist){
            System.out.println(item);
        }
        //移除arrylist中的元素
        myArraylist.remove(0);
        System.out.println(myArraylist);
    }
}
