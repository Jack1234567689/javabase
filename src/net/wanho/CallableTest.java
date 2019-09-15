package net.wanho;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableTest {
    public static void main(String[] args) {
        //把实现类的对象赋给接口的引用
        Callable callable =new MyCallable();
        //通过Executors创建了一个单例的线程池
        Executor
    }
}
class MyCallable implements Runnable<String>{
    public String call() throws Exception{
        return new
    }
}
