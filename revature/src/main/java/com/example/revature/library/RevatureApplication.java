package com.example.revature.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import com.revature.library.service.BookService;

@SpringBootApplication
public class RevatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevatureApplication.class, args);
	}

	@Bean
    public CommandLineRunner seedBooks(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book("Clean Code", "Robert Martin", "12345", true, null));
            bookRepository.save(new Book("The Pragmatic Programmer", "David Thomas", "1234567", true, null));
            bookRepository.save(new Book("Design Patterns", "Gang of Four", "765432", true, null));
            bookRepository.save(new Book("Effective Java", "Joshua Bloch", "92828272", true, null));
            bookRepository.save(new Book("Spring in Action", "Craig Walls", "23876475", true, null));
        };
    }

}
