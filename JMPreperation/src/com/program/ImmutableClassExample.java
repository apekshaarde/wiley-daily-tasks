package com.program;

import java.util.ArrayList;
import java.util.List;

final class Library{
    private int id;
    private String name;
    private String books;

    public Library(int id, String name, String books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books='" + books + '\'' +
                '}';
    }
}
public class ImmutableClassExample {
    public static void main(String[] args) {
        List<Library> l = new ArrayList<>(List.of(new Library(1,"Bell Laboratory","Take It Easy")));
        l.forEach(System.out::println);
    }
}
