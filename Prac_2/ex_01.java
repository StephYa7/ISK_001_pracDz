package Prac_2;

import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        System.out.println("Введите дробное число:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inString = scanner.nextLine();
            try {
                Float inFloat = Float.parseFloat(inString);
                if (inFloat % 1 > 0){
                System.out.println(inFloat);
                break;}
                else System.out.println(inString + " Не является дробным числом");
            } catch (NumberFormatException e) {
                System.out.println(inString + " Не является дробным числом");
            }
        }
    }
}
