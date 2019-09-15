package net.wanho;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("H:\\软件安装包");
//        System.out.println(file.exists());
//        File[] files =  file.listFiles();
//        for(File f:files){
//            System.out.println(f.getAbsolutePath());
//        }

        File file = new File("D://1234.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
