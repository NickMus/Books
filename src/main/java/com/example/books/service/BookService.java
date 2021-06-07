package com.example.books.service;

import com.example.books.entities.Book;
import com.example.books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepo bookRepo;

    @Autowired
    public void setBookRepo(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public void addToRepo(Book book) {
        bookRepo.addToRepo(book);
    }
    public List<Book> getAllFromRepo() {
        return bookRepo.getBookList();
    }
}
