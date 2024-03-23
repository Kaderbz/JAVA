package com.javastack.spring.booksApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.booksApi.models.Book;
import com.javastack.spring.booksApi.repositories.BookRepository;

@Service
public class BookService {
 // adding the book repository as a dependency
 private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book book) {
     return bookRepository.save(book);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 // updates a book
 public Book updateBook(Book book) {
     return bookRepository.save(book);
 }
 
 public List<Book> booksContaining(String search){
	 return bookRepository.findByDescriptionContaining(search);
 }
 
 // deletes a book
 public void deleteBook(Long id) {
	 bookRepository.deleteById(id);
 }
}

