package com.example.TableBookCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogBudget {
    private String catalogName;
    private int budget;
}
