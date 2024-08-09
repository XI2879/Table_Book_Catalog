package com.example.TableBookCatalog.service;

import com.example.TableBookCatalog.dto.CatalogBudget;
import com.example.TableBookCatalog.entity.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    List<Book> getAllBooks();

    List<CatalogBudget> getCatalogBudgets();
}
