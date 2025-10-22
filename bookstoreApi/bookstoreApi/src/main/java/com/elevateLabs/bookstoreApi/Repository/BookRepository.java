package com.elevateLabs.bookstoreApi.Repository;

import com.elevateLabs.bookstoreApi.Model.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByGenreIgnoreCase(String genre);
}
