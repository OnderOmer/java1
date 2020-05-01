package day29_Wrapper_Arraylist;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>(); // size :0

        for(int i = 0; i <= 100; i++){
            if(i % 2 == 1 ){
                scores.add(i);
            }

        }
        System.out.println(scores);
        scores.add(10); //Autoboxing size:1
        scores.add(20); // Autoboxing size: 2
        scores.add(30);
        System.out.println(scores);

       Integer a1 = scores.get(2);
       int a2 = scores.get(2);
       double a3 = scores.get(2);

        System.out.println(a1);



    }

}
