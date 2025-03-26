package io.CRUD.ProductCRUDProject.repository;

import io.CRUD.ProductCRUDProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
