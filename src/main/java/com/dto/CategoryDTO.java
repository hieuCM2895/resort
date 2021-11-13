package com.dto;

import com.model.Category;

public class CategoryDTO {

    public Category categoryDTO(Category category) {

        Category categoryDTO = new Category();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setListOfProduct(category.getListOfProduct());

        return categoryDTO;
    }
}
