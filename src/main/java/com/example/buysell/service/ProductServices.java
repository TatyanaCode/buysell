package com.example.buysell.service;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * author danilova.tatyana 16.02.2023
 */
@Service
public class ProductServices {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Смартфон", "кнопочный", 200, "Чебоксары", " Чижик"));
        products.add(new Product(++ID, "Ноутбук", "игровой", 200000, "Чебоксары", " Чижик"));
        products.add(new Product(++ID, "Фен", "Дигма", 3200, "Чебоксары", " Чижик"));
        products.add(new Product(++ID, "Смартфон", "кнопочный", 5200, "Чебоксары", " Чижик"));
    }
    public List<Product> listProducts() {return products;}
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

}
