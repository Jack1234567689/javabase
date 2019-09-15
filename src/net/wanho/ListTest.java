package net.wanho;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //list主要由两个实现类，linkedlist增删容易，查询耗时；ArrayList查询容易，增删困难
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        list.remove(0);
        list.clear();
        System.out.println(list.size());
    }
}
