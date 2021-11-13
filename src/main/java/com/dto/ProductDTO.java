package com.dto;

import com.model.Product;

public class ProductDTO {

    public Product productDTO(Product product) {

        Product productDTO = new Product();

        productDTO.setId(product.getId());
        productDTO.setAmount(product.getAmount());
        productDTO.setCategory(product.getCategory());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());
        productDTO.setImage(product.getImage());
        productDTO.setName(product.getName());
        productDTO.setTitle(product.getTitle());

        return productDTO;
    }
}
