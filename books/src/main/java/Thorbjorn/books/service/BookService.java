package Thorbjorn.books.service;

import Thorbjorn.books.model.Book;
import Thorbjorn.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(String isbn10){
        return bookRepository.findBookByIsbn10(isbn10);
    }
}
