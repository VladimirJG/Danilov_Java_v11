package name;

import java.util.Scanner;

public class NameCheck {
    void enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Необходимо ввести имя!");
        } else if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}