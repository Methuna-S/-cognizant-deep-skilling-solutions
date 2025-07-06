package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.BookService;
public class App
{
    public static void main( String[] args )
    {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = context.getBean("bookService", BookService.class);
            bookService.addDefaultBook();
            bookService.addBook("Clean Code");
        }
    }
}
