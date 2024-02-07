package Thorbjorn.books.controller;

import Thorbjorn.books.model.Book;
import Thorbjorn.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<List<Book>>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{isbn10}")
    public ResponseEntity<Optional<Book>> getBook(@PathVariable String isbn10){
        return new ResponseEntity<Optional<Book>>(bookService.getBook(isbn10), HttpStatus.OK);
    }
}
