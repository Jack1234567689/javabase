package net.wanho;

import java.util.Scanner;

public class SwtichTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();

        switch (i){
            case "a":
                System.out.println(i);
                break;
            case "b":
                System.out.println(i);
                break;
            case "c":
                System.out.println(i);
                break;
            default:
                System.out.println("全错，输出");
        }
        System.out.println(1==1?1:3);
    }
}
