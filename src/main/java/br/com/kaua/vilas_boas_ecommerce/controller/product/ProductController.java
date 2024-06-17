package br.com.kaua.vilas_boas_ecommerce.controller.product;

import br.com.kaua.vilas_boas_ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDetailDTO> create(@RequestBody ProductCreateDTO dto, UriComponentsBuilder uriBuilder){
        var productDetail = productService.createProduct(dto);
        var uri = uriBuilder.path("/products/{id}").buildAndExpand(productDetail.id()).toUri();
        return ResponseEntity.created(uri).body(productDetail);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetailDTO> detail(@PathVariable UUID id){
        var productDetail = productService.detailProduct(id);
        return ResponseEntity.ok(productDetail);
    }

    @GetMapping
    public ResponseEntity<Page<ProductListDTO>> getAll(@PageableDefault(size = 10, sort ={"name"}) Pageable pageable){
        var page = productService.listProducts(pageable);
        return ResponseEntity.ok(page);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody UUID id){
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}
