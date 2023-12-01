package ru.job4j.lesson;

import java.util.List;

public class GetAllBook implements Menu {

    @Override
    public boolean run(List<Book> books) {
        if (!books.isEmpty()) {
            System.out.println("В файле находятся: ");
            books.stream().forEach(book -> System.out.println(book));
        } else {
            System.out.println("Файл еще не содержит книг");
        }
        return true;
    }

}
