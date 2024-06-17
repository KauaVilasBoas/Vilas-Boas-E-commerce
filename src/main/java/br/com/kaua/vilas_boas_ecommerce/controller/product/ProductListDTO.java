package br.com.kaua.vilas_boas_ecommerce.controller.product;

import br.com.kaua.vilas_boas_ecommerce.domain.product.Product;
import br.com.kaua.vilas_boas_ecommerce.domain.product.ProductCategory;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record ProductListDTO (UUID id,
                              String name,
                              String description,
                              BigDecimal price,
                              List<String> imagesUrl,
                              ProductCategory category){

    public ProductListDTO(Product product) {
        this(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImagesUrl(), product.getCategory());
    }

}
