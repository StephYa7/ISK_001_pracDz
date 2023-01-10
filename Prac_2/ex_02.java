package Prac_2;

public class ex_02 {

    public static void main(String[] args){

    try {
        int[] intArray = {44,76,78,85,54,4,5,6,6,7};
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch ( ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

}}
