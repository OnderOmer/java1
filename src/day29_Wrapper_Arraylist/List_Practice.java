package day29_Wrapper_Arraylist;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
             shoppingList.add("Milk"); // size: 1
             shoppingList.add("Coffee"); //size: 2
             shoppingList.add("Bread"); // size: 3
             shoppingList.add("Toilet Paper");// size: 4
             shoppingList.add((" Tea "));
        System.out.println(shoppingList);
        for(String each : shoppingList){
            System.out.println(each);

        }
        System.out.println("========================================");

        // size():

        int size = shoppingList.size();
        System.out.println(size);

        int lastIndex = shoppingList.size()-1;


    }
}
