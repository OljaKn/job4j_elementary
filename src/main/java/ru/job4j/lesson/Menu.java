package ru.job4j.lesson;

import com.sun.security.jgss.GSSUtil;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void getAllBook(List<Book> books) {
        if (!books.isEmpty()) {
            System.out.println("В файле находятся: ");
            books.stream().forEach(book -> System.out.println(book));
        } else {
            System.out.println("Файл еще не содержит книг");
        }
    }

        public void addBook(List<Book> books) {
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
        }

    public void redactBook(List<Book> books) {
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
            }
        }

    }

    public void deleteBook(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя книги, которую вы хотите удалить: ");
        String nameBook = scanner.nextLine();
        for (Book book:books) {
            if (book.getName().contains(nameBook)) {
                int index = books.indexOf(book);
                books.remove(index);
                System.out.println("Удаление прошло успешно ");
            } else {
                System.out.println("Не получаеться удалить книгу ");
            }
        }
    }
}
