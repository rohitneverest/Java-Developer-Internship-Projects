package com.elevateLabs.bookstoreApi.Repository;

import com.elevateLabs.bookstoreApi.Model.Author;
import com.elevateLabs.bookstoreApi.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}