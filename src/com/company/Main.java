package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner obj = new Scanner(System.in);
        System.out.println("Submit word");
        //Sort the String
        String str = main.sort(obj.next()); // O(nlogn)
        //System.out.println(str);
        main.permutations("", str);

    }
    //Find permutations in increasing order using recursion
    public void permutations(String prefix, String str) { //O(n*n!)
        int length = str.length();

        if (length == 0)
            System.out.println(prefix);

        for (int i = 0; i < length; i++) {
            permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }
    //Sorts the string dictionary wise before creating permutations
    public String sort(String str) {
        str.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String newStr = new String(chars);
        return newStr;
    }
}
