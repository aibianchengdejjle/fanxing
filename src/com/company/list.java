package com.company;
/*
*       ArrayList
*           底层是数据结构，查询快，增删慢
*       LinkedList
*           底层是链表，查询慢，增删快.
*       如果就是增删的话就linked，如果是查询的话就array
*
* */
import java.util.*;

public class list{
    public static void main(String[] args) {
        //船舰列表对象
        LinkedList l=new LinkedList();
        l.add("hello");
        l.add("world");
        l.addFirst("java");
        l.addLast("android");
        System.out.println(l);

    }
}
