package com.brijesh.ProductService.service;import com.brijesh.ProductService.model.ProductRequest;import com.brijesh.ProductService.model.ProductResponse;public interface ProductService {    long createProduct(ProductRequest productRequest);    ProductResponse getProductById(long productId);    void reduceQuantity(long id, long quantity);}