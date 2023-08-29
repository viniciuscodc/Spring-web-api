package dev.springframework.springwebapp.repositories;

import dev.springframework.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
