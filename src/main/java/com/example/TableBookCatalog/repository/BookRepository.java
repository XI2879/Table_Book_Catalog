package com.example.TableBookCatalog.repository;

import com.example.TableBookCatalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    @Query(value = "CALL new_procedure()", nativeQuery = true)
    List<Object[]> getCatalogBudgets();

}
