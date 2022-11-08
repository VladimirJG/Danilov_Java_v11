package number;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Examination {
    void enter(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            double num = scanner.nextDouble();
            if (num % 1 != 0) {
                System.out.println("Введите целое значение");
            } else if (num > 7) {
                System.out.println("Привет");
            } else if (num < 0) {
                System.out.println("Значение должно быть положительным!");
            } else {
                System.out.println("Значение меньше допустимого");
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверное значение");
        }
    }
}

