package com.example.books.controller;

import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.books.entities.Book;

import java.util.List;


@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/bookForm")
    public String bookForm(Model uiModel) {
        Book book = new Book();
        uiModel.addAttribute("book" , book);
        return "book-form";
    }
    @RequestMapping ("/processForm")
    public String showResult(@ModelAttribute("book") Book book) {
        System.out.println(book);
        bookService.addToRepo(book);
        return "book-list";
    }
    @RequestMapping("/showAll")
    public String showAll(Model uiModel) {
        uiModel.addAttribute("bookList", bookService.getAllFromRepo());
        return "allBooks";
    }
}
