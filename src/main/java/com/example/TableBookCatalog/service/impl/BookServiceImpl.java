package com.example.TableBookCatalog.service.impl;

import com.example.TableBookCatalog.dto.CatalogBudget;
import com.example.TableBookCatalog.entity.Book;
import com.example.TableBookCatalog.repository.BookRepository;
import com.example.TableBookCatalog.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {
        Book savedBook = bookRepository.save(book);
        return savedBook;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public List<CatalogBudget> getCatalogBudgets() {
        List<Object[]> results = bookRepository.getCatalogBudgets();
        List<CatalogBudget> catalogBudgets = new ArrayList<>();

        for (Object[] result : results) {
            String catalogName = (String) result[0];
            int totalBudget = ((Number) result[1]).intValue();
            catalogBudgets.add(new CatalogBudget(catalogName, totalBudget));
        }
//        List<CatalogBudget> catalogBudgets1 = bookRepository.getCatalogBudgets().stream()
//                .map(result -> new CatalogBudget((String) result[0], ((Number) result[1]).intValue()))
//                .collect(Collectors.toList());


//       List<CatalogBudget> catalogBudgets1 = bookRepository


        return catalogBudgets;
    }
    //creating a function to calculate the amount



}
