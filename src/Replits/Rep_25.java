package Replits;

import java.util.Scanner;

public class Rep_25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        String str = "";

        if(a>b){
            str=a+"is greater";
        }else{
            str=b+" is greater";
        }
        System.out.println(str);
    }
}
