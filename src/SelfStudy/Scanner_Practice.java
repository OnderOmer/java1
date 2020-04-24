package SelfStudy;

import java.util.Scanner;
public class Scanner_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = input.next();

        System.out.println("Nice to meet you,"+firstName);
    }
}
