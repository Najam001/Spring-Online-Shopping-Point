
package com.example.rashion.service;

        import com.example.rashion.model.Category;
        import com.example.rashion.request.CategoryRequest;

        import java.util.List;

public interface CategoryService {

    String addCategory(CategoryRequest category);

    List<Category> getCategoryList();

    String deleteCategory(Integer categoryId);

}