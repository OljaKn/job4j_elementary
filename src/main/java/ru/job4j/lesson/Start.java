package ru.job4j.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    List<Book> books = new ArrayList<>();

    void menu() {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\t" + "Меню: " + "\n"
                    + "1. Вывести все книги." + "\n"
                    + "2. Добавить книгу." + "\n"
                    + "3. Редактировать книгу." + "\n"
                    + "4. Удалить книгу.");
            System.out.println("Выберите пункт меню: ");
            int in = scanner.nextInt();
            if (in == 1) {
                menu.getAllBook(books);
            } else if (in == 2) {
                menu.addBook(books);
            } else if (in == 3) {
                menu.redactBook(books);
            } else if (in == 4) {
                menu.deleteBook(books);
            }
        }
    }

    public static void main(String[] args) {
        Start application = new Start();
        application.menu();
    }
}