package com.dmm.Day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List <String> mList = new ArrayList<>();
        mList.add("Mark");
        mList.add("Paul");
        mList.add("John");

        System.out.println(mList);

        //iterator

        Iterator iterator = mList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //forEach
        for (String name : mList) {
            System.out.println(name);
        }
    }
}
