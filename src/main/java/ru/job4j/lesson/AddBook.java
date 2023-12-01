package ru.job4j.lesson;

import java.util.List;
import java.util.Scanner;

public class AddBook implements Menu {
    @Override
    public boolean run(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String newName = scanner.nextLine();
        System.out.println("Введите автора книги: ");
        String newAuthor = scanner.nextLine();
        System.out.println("Введите год издания: ");
        int newYear = scanner.nextInt();
        Book book = new Book(newName, newAuthor, newYear);
        books.add(book);
        System.out.println("Книга добавлена в файл");
        return true;
    }
}
