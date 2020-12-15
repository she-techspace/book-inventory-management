package com.sibongile.techspace.bim.service;

import com.sibongile.techspace.bim.entity.Book;

public interface BookService {
    Book findBookByid(Long id);
    Book findBookByAuthor(String author);
}
