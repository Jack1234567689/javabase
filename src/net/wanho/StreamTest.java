package net.wanho;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/1.txt");
        OutputStream outputStream = new FileOutputStream(f);
        outputStream.write("I am zhangkun.".getBytes());
        outputStream.flush();
        outputStream.close();

        InputStream inputStream = new FileInputStream(f);
        byte[] bs = new byte[2];
        int length=0;
        while(true){
            length = inputStream.read(bs,0,bs.length);
            if(length==-1){
                break;
            }
            String s= new String (bs,0,length);
            System.out.println(s);
        }

        inputStream.close();
    }
}
