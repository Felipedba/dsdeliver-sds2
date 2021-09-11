package com.devSuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
