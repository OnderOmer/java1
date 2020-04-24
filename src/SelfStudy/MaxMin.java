package SelfStudy;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int max = - 2147483648;
        int min = - 2147483648;

        int i = 3;
        while(i <= 5){

            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>max){
                max = num;
            }
        if(num < min){
            min = num;
        }
         i++;
        }


    }
}
