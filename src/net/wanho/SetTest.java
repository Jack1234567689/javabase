package net.wanho;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("123");
        set.add("456");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("123"));

        Iterator <String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        //acs码是美国标准信息校验码，每一个常用字符对应到证书为1：49 A:65 a:97
        Set<String> set1 = new TreeSet<>();
        set1.add("abc");
        set1.add("adf");
        set1.add("1kl");
        set1.add("mbv");
        Iterator <String> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
