package cirle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        do {
            System.out.println(" Угадай число с 1 до 10 : ");
            value = scanner.nextInt();
            System.out.println("неа");

        }
        while (value != 10);
        System.out.println("Правильно");


    }
}
