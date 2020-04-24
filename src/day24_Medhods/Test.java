package day24_Medhods;

import Resources.Library;
import java.util.Arrays;
public class Test {

    public static void main(String[] args) {
       String str ="Ozgur";
       String RevStr = Library.Reverse(str);

        System.out.println(RevStr);

        int [] arr = {5,9,10,3,2,-1};

        Library.sortDesending( arr);
        System.out.println(Arrays.toString(arr));

    }
}
