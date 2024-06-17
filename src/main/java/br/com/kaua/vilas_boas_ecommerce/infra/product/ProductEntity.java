package br.com.kaua.vilas_boas_ecommerce.infra.product;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_url")
    private List<String> imagesUrl;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public ProductEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public ProductEntity(String name, String description, BigDecimal price, int quantity, List<String> imagesUrl, ProductCategory category) {
        this();
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imagesUrl = imagesUrl;
        this.category = category;
    }
}
