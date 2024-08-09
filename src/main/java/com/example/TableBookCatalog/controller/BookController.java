package com.example.TableBookCatalog.controller;

import com.example.TableBookCatalog.dto.CatalogBudget;
import com.example.TableBookCatalog.entity.Book;
import com.example.TableBookCatalog.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book> savingBook(@RequestBody Book book) {
        System.out.println(book);
        return  ResponseEntity.ok(bookService.saveBook(book));
    }
    @GetMapping
    public ResponseEntity<List<Book>> getAllBook() {
        return  ResponseEntity.ok(bookService.getAllBooks());
    }
    @GetMapping("/catalogBudgets")
    public ResponseEntity<List<CatalogBudget>> getCatalogBudgets() {
        return ResponseEntity.ok(bookService.getCatalogBudgets());
    }

}
