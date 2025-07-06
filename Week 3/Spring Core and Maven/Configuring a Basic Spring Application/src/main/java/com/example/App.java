package com.example;

import com.example.service.BookService;
public class App
{
    public static void main( String[] args )
    {
        BookService bookService = new BookService();
        bookService.addBook("The Lord of the Rings");
    }
}
