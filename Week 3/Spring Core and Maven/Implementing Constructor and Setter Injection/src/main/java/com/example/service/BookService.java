package com.example.service;

import com.example.repository.BookRepository;

public class BookService {
    private String defaultBookName;
    private BookRepository bookRepository;

    public BookService(String defaultBookName) {
        this.defaultBookName = defaultBookName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addDefaultBook() {
        System.out.println("Adding default book: " + defaultBookName);
        bookRepository.saveBook(defaultBookName);
    }

    public void addBook(String name) {
        System.out.println("Adding book: " + name);
        bookRepository.saveBook(name);
    }
}
