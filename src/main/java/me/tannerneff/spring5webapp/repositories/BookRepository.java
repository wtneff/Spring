package me.tannerneff.spring5webapp.repositories;

import me.tannerneff.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
