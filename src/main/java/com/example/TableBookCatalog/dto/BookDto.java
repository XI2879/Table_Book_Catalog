package com.example.TableBookCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Long Id;
    private String bookName;
    private String catalogName;
    private int price;
}
