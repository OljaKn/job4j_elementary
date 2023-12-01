package ru.job4j.lesson;

import java.util.List;
import java.util.Scanner;

public class RedactBook implements Menu {
    @Override
    public boolean run(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя книги, которую вы хотите отредактировать: ");
        String nameBook = scanner.nextLine();
        for (Book book:books) {
            if (book.getName().contains(nameBook)) {
                books.remove(book);
                System.out.println("Введите новое имя книги: ");
                String newName = scanner.nextLine();
                System.out.println("Введите имя автора: ");
                String newAuthor = scanner.nextLine();
                System.out.println("Введите год издания: ");
                int newYear = scanner.nextInt();
                books.add(new Book(newName, newAuthor, newYear));
                System.out.println("Книга отредактированна");
            }
        }
        return true;
    }
}
