package br.com.kaua.vilas_boas_ecommerce.controller.product;

import br.com.kaua.vilas_boas_ecommerce.domain.product.ProductCategory;

import java.math.BigDecimal;
import java.util.List;

public record ProductCreateDTO(String name,
                               String description,
                               BigDecimal price,
                               int quantity,
                               List<String> imagesUrl,
                               ProductCategory category) {
}
