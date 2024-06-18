package br.com.kaua.vilas_boas_ecommerce.service;

import br.com.kaua.vilas_boas_ecommerce.controller.product.ProductCreateDTO;
import br.com.kaua.vilas_boas_ecommerce.controller.product.ProductDetailDTO;
import br.com.kaua.vilas_boas_ecommerce.controller.product.ProductListDTO;
import br.com.kaua.vilas_boas_ecommerce.domain.product.Product;
import br.com.kaua.vilas_boas_ecommerce.domain.product.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDetailDTO createProduct(ProductCreateDTO dto) {
        var product = new Product(dto.name(), dto.description(), dto.price(), dto.quantity(), dto.imagesUrl(), dto.category());
        productRepository.save(product);
        return new ProductDetailDTO(product);
    }

    public ProductDetailDTO detailProduct(UUID id) {
        var product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return new ProductDetailDTO(product);
    }


    public Page<ProductListDTO> listProducts(Pageable pageable) {
        return productRepository.findAll(pageable).map(ProductListDTO::new);
    }

    public void deleteProduct(UUID id) {
        var product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        product.delete();
    }
}
