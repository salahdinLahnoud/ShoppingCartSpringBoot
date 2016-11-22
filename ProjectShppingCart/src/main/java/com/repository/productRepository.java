package com.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Pageable;
import com.model.Product;


public interface productRepository extends CrudRepository<Product, Long>{
	
	//Page<Product> findAll(Pageable pageable);
	
}
