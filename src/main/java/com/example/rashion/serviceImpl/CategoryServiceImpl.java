package com.example.rashion.serviceImpl;

import com.example.rashion.model.Category;
import com.example.rashion.reporsitory.CategoryRepository;
import com.example.rashion.request.CategoryRequest;
import com.example.rashion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


        import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public String addCategory(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());

        categoryRepository.save(category);
        return "your Category has been added successfully";
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    public String deleteCategory(Integer categoryId) {

         categoryRepository.deleteById(categoryId);
         return "Category has been Deleted";
    }

}
