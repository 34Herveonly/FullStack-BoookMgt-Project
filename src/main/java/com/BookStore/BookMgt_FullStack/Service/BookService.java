package com.BookStore.BookMgt_FullStack.Service;

import com.BookStore.BookMgt_FullStack.Entity.Books;
import com.BookStore.BookMgt_FullStack.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor-based dependency injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to save a book entity
    public void save(Books book) {
        bookRepository.save(book);
    }

    public List<Books> getAllBooks(){
        return  bookRepository.findAll();
    }
public Books getBookById(long id) {
        return bookRepository.findById(id).get();
}
public void deleteBookById(long id) {
        bookRepository.deleteById(id);

}

}
