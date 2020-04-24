package Replits;

import java.util.Scanner;

public class Rep_32_Seconds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int minutes = (inputSeconds / 60) % 60;
        int hours = ((inputSeconds / 60) / 60) % 60;
        int seconds = inputSeconds % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

    }

}
