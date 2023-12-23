package base.basics;

import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(tableOfNum(scanner.nextInt()));
    }

    public static String tableOfNum(int n) {
        StringBuilder multiples = new StringBuilder();
        for(int i=1;i<=10;i++) {
            multiples.append(n*i+" ");
        }
        return multiples.toString();
    }
}
