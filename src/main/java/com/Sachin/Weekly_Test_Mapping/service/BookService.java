package com.Sachin.Weekly_Test_Mapping.service;

import com.Sachin.Weekly_Test_Mapping.model.Book;
import com.Sachin.Weekly_Test_Mapping.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book);
        return "add";
    }

    public List<Book> getBooks() {
       return bookRepo.findAll();
    }

    public String deleteBook(Long bookId) {
       Optional<Book> bookOptional = bookRepo.findById(bookId);
       if(bookOptional.isPresent()){
           bookRepo.deleteById(bookId);
           return "deleted";
       }
       return "id not found";
    }
}
