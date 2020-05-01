package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,7,8,9,0,9));
        Collections.reverse(list);
        System.out.println(list);
      Collections.sort(list);
        System.out.println(list);
    }
}
