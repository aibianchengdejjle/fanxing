package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/*
*   foreach：增强的for循环
*   在这哥循环里面不能修改集合，不然会出现并发修改异常
* */
public class fanxing {
    public static void main(String[] args) {
        Stack w=new Stack();
        w.push(11545);
        w.push("5444");
        for (int i = 0; !w.empty() ; i++) {
            Object a=w.pop();
            System.out.println(a);
        }
      /*  Collection<String> c=new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("Java");
        //增加for循环
        for (String s:c) {

        }*/
    }
}

