package com.javarush.test;

/**
 * Created by senya on 10/28/2016.
 */
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}