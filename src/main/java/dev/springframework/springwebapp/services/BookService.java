package dev.springframework.springwebapp.services;

import dev.springframework.springwebapp.domain.Book;

public interface BookService  {
    Iterable<Book> findAll();
}
