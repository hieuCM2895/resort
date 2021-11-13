package com.service;

import com.dao.CategoryDao;
import com.model.Category;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public void deleteCategory(long id) {
        categoryDao.deleteById(id);
    }

    @Override
    public Boolean updateCategory(Category category) {
        return categoryDao.save(category) != null;
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryDao.findAll();
    }

    @Override
    public Category findCategoryById(long id) {
        return categoryDao.findById(id).orElseThrow(() -> new UsernameNotFoundException("Category not found with id: " + id));
    }
}
