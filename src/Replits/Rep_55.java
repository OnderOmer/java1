package Replits;

import java.util.Scanner;

public class Rep_55 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();
        String result="";

        switch (number){
            case 1 :result="Monday";
                    break;
            case 2: result="Tuesday";
                   break;
            case 3: result="Wednesday";
                   break;
            case 4: result="Thursday";
                    break;
            case 5: result="Friday";
                    break;
            case 6: result="Saturday";
                     break;
            case 7: result="Sunday";
                     break;
        }
        System.out.println(result);
    }
}
