package main.java.com.example.revature.library;

import com.example.revature.model.Book;
import com.example.revature.repository.BookRepository;
import com.revature.library.service.BookService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@Configuration
public class DataSeeder {

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