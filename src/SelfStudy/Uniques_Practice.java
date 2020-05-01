package SelfStudy;

import java.util.ArrayList;

public class Uniques_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);


       ArrayList<Integer> uniques = new ArrayList<>();


        int count = 0;

        for( Integer each: list){
            if(each == list.get(0)){
                count++;
            }
        }
       if(count == 1){
           uniques.add(list.get(0));
       }
    }
}
