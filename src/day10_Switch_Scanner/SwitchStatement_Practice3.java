package day10_Switch_Scanner;

public class SwitchStatement_Practice3 {


    public static void main(String[] args) {

        char ch ='a';

        switch (ch){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;

            default:
                System.out.println("Invalid");


        }


    }
}
