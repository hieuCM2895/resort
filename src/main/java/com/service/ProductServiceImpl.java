package com.service;

import com.dao.ProductDao;
import com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        productDao.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAll();
    }

    @Override
    public Product findProductById(long id) {
        return productDao.findById(id).orElseThrow(() -> new UsernameNotFoundException("Product not found with id: " + id));
    }
}
