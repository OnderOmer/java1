package SelfStudy;

import java.text.DecimalFormat;

public class averageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat();
   int[] arr = {30,50,70,90,100};
   // average: sum of all numbers / length


        int length = arr.length;// total number of the element
        int sum = 0;

        for(int i = 0; i < length; i++){
            int eachNum = arr[i];
            sum += eachNum;
        }
        System.out.println(sum);

        double average = sum/(double)length;
        System.out.println(average);
        System.out.println(DF.format(average));
        int[] arr2 = {1,2,2};//5/2=
        System.out.println(5/3);
        System.out.println(5/(double)3);



    }
}
