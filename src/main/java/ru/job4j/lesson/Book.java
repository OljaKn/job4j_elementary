package ru.job4j.lesson;

public class Book {
    private String name;
    private String author;
    private float year;

    public Book(String name, String author, float year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getYear() {
        return year;
    }

    public void setYear(float year) {
        this.year = year;
    }
}
