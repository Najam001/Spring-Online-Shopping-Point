package com.example.rashion.reporsitory;

import com.example.rashion.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category,Integer> {

    @Override
    void deleteById(Integer categoryId);

    @Override
    List<Category> findAll();
}