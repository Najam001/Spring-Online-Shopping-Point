package com.example.rashion.controller;
import com.example.rashion.model.Category;
import com.example.rashion.request.CategoryRequest;
import com.example.rashion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    /*Add a new category*/
    @PostMapping("/category")
    public String addNewCategory(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.addCategory(categoryRequest);
    }

    /** Get all categorys**/
    @GetMapping(path = "category")
    public List<Category> getAllCategoryList() {
        return categoryService.getCategoryList();
    }

    @DeleteMapping(path = "/category/{categoryId}")
    public String deleteCategory(@PathVariable Integer categoryId) {
       return categoryService.deleteCategory(categoryId);
    }
}