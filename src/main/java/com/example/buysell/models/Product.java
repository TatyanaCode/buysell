package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * author danilova.tatyana 16.02.2023
 */
@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
