package Replits;

import java.util.Scanner;

public class Rep_26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean positive=(num > 0);
        boolean negative=(num < 0);
        boolean zero=(num==0);


        if (positive){
            System.out.println("positive");
        }
        if(negative){
            System.out.println("negative");
        }
        if(zero){
            System.out.println("zero");
        }


    }
}
