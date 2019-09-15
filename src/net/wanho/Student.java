package net.wanho;

/**
 * 一个类由属性+方法
 */
public class Student {
    public static void main(String[] args) {
        System.out.println();
        String s1= new String ("1234");
        String s2= "12345y";
        String s3= new String(new byte[]{3,3,4,5,6});
    }
    {
        System.out.println("shilidaimakuai");
    }
    static{
        System.out.println("静态代码块");
    }
    //无参构造方法可以不写

    /**
     * 方法名称相同，参数列表不同，就是多态
     * 重载，重写，面向接口编程，对象的上转型
     */
    public Student(){

    }
    public Student(int age){
        this.age = age;//this指当前类，只能用于实例方法
    }
    //一个类中，属性通常用来描述静态的信息
    int age;//成员变量
    String name;

    //一个类中，功能通常用来描述动态的信息
    public void run(){

    }
}
