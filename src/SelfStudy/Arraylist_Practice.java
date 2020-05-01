package SelfStudy;

import java.util.ArrayList;

public class Arraylist_Practice {

    public static void main(String[] args) {
        int[] num1 = new int[10];

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(50);
        numbers.add(98);
        numbers.add(67);
        numbers.add(1,34);

        System.out.print(numbers);
      //  System.out.print(numbers.get(3));

        for(Integer x: numbers){
            System.out.println(x+"_");
        }
       numbers.remove(0);
        System.out.println("\n"+ numbers);




    }

    }
