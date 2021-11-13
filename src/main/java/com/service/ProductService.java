package com.service;

import com.model.Category;
import com.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    void deleteProduct(long id);

    void updateProduct(Product product);

    List<Product> findAllProduct();

    Product findProductById(long id);
}
