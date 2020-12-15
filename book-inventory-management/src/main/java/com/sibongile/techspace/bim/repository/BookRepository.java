package com.sibongile.techspace.bim.repository;

import com.sibongile.techspace.bim.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
    List<Book> findByName(String name);
    
}
