package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner obj = new Scanner(System.in);
        System.out.println("Submit word");
        String str = main.sort(obj.next());
        //System.out.println(str);
        main.permutations("", str);

    }

    public void permutations(String prefix, String str) {
        int length = str.length();

        if (length == 0)
            System.out.println(prefix);

        for (int i = 0; i < length; i++) {
            permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }

    public String sort(String str) {
        str.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String newStr = new String(chars);
        return newStr;
    }
}
