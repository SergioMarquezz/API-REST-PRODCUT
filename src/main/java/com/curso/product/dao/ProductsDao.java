package com.curso.product.dao;

import com.curso.product.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsDao extends JpaRepository<Product, Long>{

}
