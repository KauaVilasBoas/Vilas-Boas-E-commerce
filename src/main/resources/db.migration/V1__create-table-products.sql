CREATE TABLE tb_products (
                             id UUID PRIMARY KEY,
                             name VARCHAR(255) NOT NULL,
                             description TEXT,
                             price NUMERIC(19, 2) NOT NULL,
                             quantity INTEGER NOT NULL,
                             created_at TIMESTAMP NOT NULL,
                             updated_at TIMESTAMP NOT NULL,
                             deleted_at TIMESTAMP,
                             category VARCHAR(255) NOT NULL
);

CREATE TABLE product_images (
                                product_id UUID REFERENCES tb_products(id),
                                image_url TEXT,
                                PRIMARY KEY (product_id, image_url)
);