package com.mutyala.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mutyala.jpa.book.Book;
import com.mutyala.jpa.book.BookDetail;
import com.mutyala.jpa.book.BookRepository;

@RequiredArgsConstructor
@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Book and BookDetail
        bookRepository.save(new Book("Hello Koding 1", new BookDetail(101)));
        bookRepository.save(new Book("Hello Koding 2", new BookDetail(102)));
    }
}
