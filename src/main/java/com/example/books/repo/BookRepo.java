package com.example.books.repo;

import com.example.books.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepo {

    List<Book> bookList = new ArrayList<>(Arrays.asList());

    public void addToRepo(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        System.out.println(Arrays.toString(bookList.toArray()));
        return bookList;
    }
}
