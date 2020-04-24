package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Ozgur";
        char[] characters= name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek ";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean euqalStr = Arrays.equals(ch1,ch2);

        System.out.println(euqalStr);


    }
}
