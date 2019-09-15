package net.wanho;

public class Father {
    public void test(){
        System.out.println("Father.test()");

    }
    public void test(int age){
        System.out.println("Father.test(int age)");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.test();

        Son son = new Son();
        son.test();
        son.test(1);

        Father f1 = new Son();
        f1.test();
        f1.test(10);



    }
}
