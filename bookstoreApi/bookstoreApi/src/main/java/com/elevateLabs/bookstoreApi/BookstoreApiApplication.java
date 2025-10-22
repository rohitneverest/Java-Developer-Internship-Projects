package com.elevateLabs.bookstoreApi;

import com.elevateLabs.bookstoreApi.Model.Author;
import com.elevateLabs.bookstoreApi.Model.Book;
import com.elevateLabs.bookstoreApi.Repository.AuthorRepository;
import com.elevateLabs.bookstoreApi.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookstoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApiApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData(AuthorRepository authorRepo, BookRepository bookRepo) {
		return args -> {

			// --- Author 1 ---
			Author author1 = new Author();
			author1.setName("J.K. Rowling");


			// --- Author 2 ---
			Author author2 = new Author();
			author2.setName("George R.R. Martin");

			// --- Author 3 ---
			Author author3 = new Author();
			author3.setName("Agatha Christie");

			// --- Author 4 ---
			Author author4 = new Author();
			author4.setName("Dan Brown");



			// --- Book 1 ---
			Book book1 = new Book();
			book1.setTitle("Harry Potter and the Sorcerer's Stone");
			book1.setGenre("Magical");
			book1.setPublicationYear(1998);
			book1.setPrice(2000);
			book1.setAuthor(author1);
			bookRepo.save(book1);



			// --- Book 2 ---
			Book book2 = new Book();
			book2.setTitle("A Game of Thrones");
			book2.setGenre("Fantasy");
			book2.setPublicationYear(2005);
			book2.setPrice(4000);
			book2.setAuthor(author2);





			// --- Book 3 ---
			Book book3 = new Book();
			book3.setTitle("A Dance with Dragons");
			book3.setGenre("Fantasy");
			book3.setPublicationYear(2011);
			book3.setPrice(6000);
			book3.setAuthor(author2);

			List<Book> liBook2n3=new ArrayList<>();
			liBook2n3.add(book2);
			liBook2n3.add(book3);

			bookRepo.saveAll(liBook2n3);



			// --- Book 4 ---
			Book book4 = new Book();
			book4.setTitle("Murder on the Orient Express");
			book4.setGenre("Mystery");
			book4.setPublicationYear(1934);
			book4.setPrice(2500);
			book4.setAuthor(author3);

			// --- Book 5 ---
			Book book5 = new Book();
			book5.setTitle("The Da Vinci Code");
			book5.setGenre("Thriller");
			book5.setPublicationYear(2003);
			book5.setPrice(3200);
			book5.setAuthor(author4);

			// --- Book 6 ---
			Book book6 = new Book();
			book6.setTitle("Inferno");
			book6.setGenre("Thriller");
			book6.setPublicationYear(2013);
			book6.setPrice(3500);
			book6.setAuthor(author4);

			// Save all books (cascade will save authors automatically)
			bookRepo.saveAll(List.of(book4, book5, book6));









			System.out.println("4 authors and 6 books inserted!");
		};
	}


}
