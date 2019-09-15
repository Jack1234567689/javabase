package net.wanho;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(1234);

        int a = 9;
        Integer it =  10;
        it =  it + a;
        System.out.println(it);

        int [] is = new int[] {1,2,4};
        System.out.println(Arrays.toString(is));

        for(int i=0;i<is.length;i++){
            System.out.print(is[i]);
        }
        System.out.println();
        for (int i:is){
            System.out.print(i);
        }
        System.out.println();

        int j = 0;
        while(true){
            System.out.println(is[j]);
            j++;
            if(j==is.length){
                break;
            }
        }
        j=0;
        do{
            System.out.println(is[j]);
            j++;
            if(j==is.length){
                break;
            }
        }while(true);

        test();
        Test t= new Test();
        t.test1();
    }
    public void test1(){
        test2();
    }
    public void test2(){
        test1();
    }
    public static void test(){
        Test t1 = new Test();
        t1.test1();
        new Test().test1();
    }
}
