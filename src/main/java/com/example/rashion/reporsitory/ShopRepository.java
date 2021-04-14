package com.example.rashion.reporsitory;

import com.example.rashion.model.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ShopRepository extends CrudRepository<Shop,Integer> {

    @Override
    void deleteById(Integer shopId);

    @Override
    List<Shop> findAll();
}
