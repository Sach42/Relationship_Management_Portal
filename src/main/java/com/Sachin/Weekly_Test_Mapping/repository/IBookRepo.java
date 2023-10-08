package com.Sachin.Weekly_Test_Mapping.repository;

import com.Sachin.Weekly_Test_Mapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
