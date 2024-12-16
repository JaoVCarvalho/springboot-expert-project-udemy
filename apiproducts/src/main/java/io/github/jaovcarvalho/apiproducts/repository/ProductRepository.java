package io.github.jaovcarvalho.apiproducts.repository;

import io.github.jaovcarvalho.apiproducts.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);
}
