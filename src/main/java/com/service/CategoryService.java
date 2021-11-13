package com.service;

import com.model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(Category category);

    void deleteCategory(long id);

    Boolean updateCategory(Category category);

    List<Category> findAllCategory();

    Category findCategoryById(long id);
}
