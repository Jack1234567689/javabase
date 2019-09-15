package net.wanho;

public class ThreadTest {
    public static void main(String[] args) {
        new MyThread().start();//将程序变为就绪状态


        System.out.println(1234);

        System.out.println(6789);
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

}
