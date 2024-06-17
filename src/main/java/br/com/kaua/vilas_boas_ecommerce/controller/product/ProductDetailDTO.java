package br.com.kaua.vilas_boas_ecommerce.controller.product;

import br.com.kaua.vilas_boas_ecommerce.domain.product.Product;
import br.com.kaua.vilas_boas_ecommerce.domain.product.ProductCategory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ProductDetailDTO(UUID id,
                               String name,
                               String description,
                               BigDecimal price,
                               int quantity,
                               List<String> imagesUrl,
                               ProductCategory category,
                               LocalDateTime createdAt,
                               LocalDateTime updatedAt,
                               LocalDateTime deletedAt) {

    public ProductDetailDTO(Product product) {
        this(product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantity(),
                product.getImagesUrl(),
                product.getCategory(),
                product.getCreatedAt(),
                product.getUpdatedAt(),
                product.getDeletedAt());
    }
}
