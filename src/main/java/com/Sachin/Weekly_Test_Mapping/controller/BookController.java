package com.Sachin.Weekly_Test_Mapping.controller;

import com.Sachin.Weekly_Test_Mapping.model.Book;
import com.Sachin.Weekly_Test_Mapping.model.Course;
import com.Sachin.Weekly_Test_Mapping.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("Books")
    public  String addBook(@RequestBody @Valid Book book){
        return bookService.addBook(book);
    }

    @GetMapping("Books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @DeleteMapping("book/{id}")
    public  String deleteBook(@PathVariable Long BookId)
    {
        return  bookService.deleteBook(BookId);
    }
}
