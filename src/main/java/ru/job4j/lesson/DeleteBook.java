package ru.job4j.lesson;

import java.util.List;
import java.util.Scanner;

public class DeleteBook implements Menu {

    @Override
    public boolean run(List<Book> books) {
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
        return true;
    }
}
