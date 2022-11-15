package name;
//Составить алгоритм: если введенное имя совпадает с Вячеслав,
//то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        enterName(scanner.nextLine());
    }

     static void enterName(String name) {
        if (name.isEmpty()) {
            System.out.println("Необходимо ввести имя!");
        } else if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет " + name + "!");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}