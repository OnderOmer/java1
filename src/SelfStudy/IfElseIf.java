package SelfStudy;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
    char grade = 'C';

    if(grade =='A'){
        System.out.println("Excellent");
    }else if(grade == 'B'){
        System.out.println("Good");
    }else if(grade == 'C'){
        System.out.println("Not Bad");
    }else{
        System.out.println("Could be better");
    }
        System.out.println("======================================================");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your shoe size");
        int size = scan.nextInt();
        if(size > 12){
            System.out.println("Sorry, your shoe size is not in stock");
        }else if(size >= 6){
            System.out.println("Your shoe is in stock!");
        }else {
            System.out.println("Sorry, this store does not carry shoes smaller size");
        }
        System.out.println("=========================================");

        System.out.println("Enter a number");
        int number = scan.nextInt();
        if(number >=0 && number <=100){
            System.out.println("Number is between o -100");
        }else if(number > 100 && number <= 1000){
            System.out.println("Number is between 101 - 1000");
        }else if(number > 1000 && number <= 1000000){
            System.out.println("Number is between 1001 - 1000000");
        }else{
            System.out.println("Number is either negative or more than 10000000");

        }



    }
}
