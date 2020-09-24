package com.company;
/*
*       集合的遍历方式
*        1  Object []p=c.toArray();这样就可以了
*        2  iterator ，返回一个迭代器对象，我们可以通过迭代器来进行遍历
*       Iterator :可以用于遍历集合
*      E  next():返回下一个元素
*        Iterator it=c.iterator();
        System.out.println(it.next());
        可以用hasnext（）来进行
        * while(it.hasNext())
            System.out.println(it.next());
* */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //method3();
        //method2();
        // method1();
        // method();
    }

    private static void method3() {
        List c=new ArrayList();
        c.add("44");
        c.add("hello");
        c.add("Java");
        ListIterator it=c.listIterator();
        while(it.hasNext())
        {
            String s=(String)it.next();
            if(s=="Java")
            {
                it.add("andro");
            }
        }
        System.out.println(c);
    }

    private static void method2() {
        Collection c=new ArrayList();
        c.add("44");
        c.add("hello");
        c.add("Java");
        if(c.contains("Java"))
        {
            c.add("android");
        }
        System.out.println(c);
    }

    private static void method1() {
        Collection c=new ArrayList();

        c.add("44");
        c.add("hello");
        c.add("Jvaa");
        // 获取迭代器对象
        Iterator it=c.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

    private static void method() {
        Collection c=new ArrayList();
        System.out.println(c.add("44"));
        System.out.println(c.add(4444441));
        // System.out.println(c.remove("44"));
        Object []p=c.toArray();
        for (int i = 0; i <p.length ; i++) {
            System.out.println(p[i]);
        }
    }
}
