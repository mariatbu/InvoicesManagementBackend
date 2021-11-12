package com.example.demo.domain.productdomain;

public interface ProductRepositoryWritable {
    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
}
