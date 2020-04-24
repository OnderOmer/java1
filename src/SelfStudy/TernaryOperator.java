package SelfStudy;

public class TernaryOperator {

    public static void main(String[] args) {
        int n1 = 5, n2 = 10;
        int max;

        //    if(n1 > n2){
        //        max = n1;
        //  }else{
        //    max = n2;

        max = (n1 > n2) ? n1 : n2;
        System.out.println(max);

        int bill = 2400;
        int discount = (bill > 2000) ? 15 : 10;

        System.out.println(discount);

        bill = 1400;
        int quantity = 11;
        if (bill > 100) {
            if (quantity > 11) {

            } else {
                discount = 9;
            }

        } else {
            discount = 5;
        }
    discount = (bill > 100) ? ( quantity > 11) ? 10 : 9 :5;
        System.out.println(discount);

    }

}