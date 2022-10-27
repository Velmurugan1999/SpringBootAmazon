package com.amazon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.models.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
