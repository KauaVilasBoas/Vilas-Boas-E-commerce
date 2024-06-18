package br.com.kaua.vilas_boas_ecommerce.controller.product;

import br.com.kaua.vilas_boas_ecommerce.domain.product.Product;
import br.com.kaua.vilas_boas_ecommerce.domain.product.ProductCategory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ProductDeleteDTO(UUID id) {
}
