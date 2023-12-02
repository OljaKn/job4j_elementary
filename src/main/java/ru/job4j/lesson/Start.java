package ru.job4j.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Start {
    List<Book> books = new ArrayList<>();

    void menu() {
        boolean var = true;
        Menu[] menu = {new GetAllBook(), new AddBook(), new RedactBook(), new DeleteBook()};
        List<Menu> menu1 = new ArrayList<>(Arrays.asList(menu));
        Scanner scanner = new Scanner(System.in);
        while (var) {
            System.out.println("\t" + "Меню: " + "\n"
                    + "0. Вывести все книги." + "\n"
                    + "1. Добавить книгу." + "\n"
                    + "2. Редактировать книгу." + "\n"
                    + "3. Удалить книгу.");
            System.out.println("Выберите пункт меню: ");
            int in = scanner.nextInt();
            if (in >= menu1.size() || in < 0) {
                System.out.println("Неверный ввод!");
                continue;
            }
            Menu menu2 = menu1.get(in);
            var = menu2.run(books);
        }
    }

    public static void main(String[] args) {
        Start application = new Start();
        application.menu();
    }
}