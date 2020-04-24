package day19_Arrays;

public class Arrays_Intro {

    public static void main(String[] args) {

        //   int scores = 90 , 10, 20;  regular variables can only have one data

        /*
        decleration:
				DataType[]  variableName = { dat1, data2, data3 };
				// 70, 75, 85, 90, 95, 100
         */

        int[] scores = { 70, 75, 85, 90, 95, 100};
        //               0   1    2   3   4   5

        // retrive: variableName[index]

        int num1 = scores[2]; //85,  int

        System.out.println(num1);


        int num2 = scores[5]; // 100, int

        System.out.println(num2);


        System.out.println("=================================");

        int [] ozgur = {15,30,45,50,};
             //          0 1   2  3

        int num3 = ozgur[2];
        System.out.println(num3);

        int num4 = ozgur[0];
        System.out.println(num4);


    }
}
