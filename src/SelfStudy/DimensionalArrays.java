package SelfStudy;

public class DimensionalArrays {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4};


        int count = 0; // to find out how many time a value is appeared in the array.
        for(int i=0; i < arr.length; i++ ){
            if(arr[i]==1){  // compares each index of the array with the given value
                count++; // everytime if the value is occured in the array, count will be increased by one


            }

        }


    }
}