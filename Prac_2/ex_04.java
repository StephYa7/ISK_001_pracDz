package Prac_2;

import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {
        System.out.println("Введите что либо:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        while (true){
            if(inputLine.isEmpty()){
                System.out.println("Вы ничего не ввели.");
            }
            inputLine = scanner.nextLine();
        }
    }
}
