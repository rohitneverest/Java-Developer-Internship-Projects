package com.elevateLabs.bookstoreApi.Controller;


import com.elevateLabs.bookstoreApi.Model.Book;
import com.elevateLabs.bookstoreApi.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bookQuery")
public class BookQueryController {


    @Autowired
    BookRepository bookRepo;


//Filtering

    @GetMapping
    public List<Book> getByGenre(@RequestParam String genre){


        List<Book> liBo= bookRepo.findByGenreIgnoreCase(genre);
        List<Book> removeList=new ArrayList<>();
        for(Book book:liBo){
            book.setAuthor(null);
            removeList.add(book);

        }
        return removeList;
    }


//Sorting   &   //Pagination

    @GetMapping("/pagination")
    public List<Book> getPage(@RequestParam(defaultValue = "bookId") String sortBy,
                              @RequestParam(defaultValue = "asc") String sortDir,

                              @RequestParam(defaultValue = "1") int pageNo,
                              @RequestParam(defaultValue = "3") int pageSize,
                              @RequestParam(required = false) String search

                             ){
        Sort sorted=null;
        if(sortDir.equalsIgnoreCase("desc")){
          sorted=Sort.by(sortBy).descending();
        }else{
            sorted=Sort.by(sortBy).ascending();
        }
        
        
        Pageable page=PageRequest.of(pageNo-1,pageSize,sorted);
        List<Book> paginatedBooks =bookRepo.findAll(page).getContent();

        List<Book> afterRemovingAuthor=new ArrayList<>();
        for(Book book:paginatedBooks){
            book.setAuthor(null);
            afterRemovingAuthor.add(book);

        }
        
        return afterRemovingAuthor;
    }








}
