package br.com.kaua.vilas_boas_ecommerce.domain.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Page<Product> findByCategory(ProductCategory category, Pageable pageable);
    Page<Product> findAllByDeletedAtIsNull(Pageable pageable);
}
