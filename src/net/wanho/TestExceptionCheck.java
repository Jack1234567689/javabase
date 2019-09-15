package net.wanho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestExceptionCheck {
    public static void main(String[] args) {
//        File file = new File("Z:/123.txt");
//        System.out.println(file.exists());
//        try {
//            InputStream is = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void f() throws Exception {
            throw new Exception();
        }
    }

