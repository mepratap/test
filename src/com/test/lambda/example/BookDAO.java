package com.test.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"Core-java",400));
        books.add(new Book(102,"Hibernate",200));
        books.add(new Book(101,"Spring",150));
        books.add(new Book(101,"WebService",400));
        return books;
    }
}
