package com.javaprograms.javahashmap;

import java.util.HashMap;

/**
 * Created by Woof on 2016/7/2 0002.
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap myhashmap=new HashMap();
        myhashmap.put("woof1",1);
        System.out.println("value:"+myhashmap.get("woof1"));
    }
}
