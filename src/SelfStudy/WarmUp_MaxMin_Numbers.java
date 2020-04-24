package SelfStudy;

import java.util.Arrays;

public class WarmUp_MaxMin_Numbers {

public static void MaxNumber(int[] array){
    Arrays.sort(array);// ascending order
    System.out.println("Maximum number is:"+array[array.length-1]);

}


  public static void MinNumber(int[]array){
    Arrays.sort(array); // ascending order
      System.out.println("Minimum number is:"+array[0]);
  }

  public static void Descending(int[]array){ //1,2,3
    Arrays.sort(array);
    for(int i = array.length-1; i>=0; i--){
        System.out.print(array[i]+" ");
    }
   // 3,2,1
      System.out.println();
}

    public static void main(String[] args) {
        int[]arr ={10,8,9,5,4,3,2,1};
       // MaxNumber(arr);//10 , if the parameter is array, the argument Must be array
       MaxNumber(arr);
       MinNumber(arr);
       Descending(arr);
    }


}
