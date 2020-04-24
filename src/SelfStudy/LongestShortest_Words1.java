package SelfStudy;

public class LongestShortest_Words1 {

    public static void main(String[] args) {


        String [] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLengthString = names[0].length();
        String longestword = "";
        for(int i = 0; i < names.length;i++){

            if(names [i].length()> maxLengthString){
                maxLengthString = names [i].length();
                longestword = names[i];
            }
        }

        System.out.println(longestword);



    }
}
