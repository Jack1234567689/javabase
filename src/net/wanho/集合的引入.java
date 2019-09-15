package net.wanho;

import com.sun.org.apache.xalan.internal.xsltc.dom.UnionIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 集合的引入 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();//泛型
        list.add(1);
        for(int i=0;i<100;i++){
            list.add(i);
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            Integer obj = list.get(i);
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
