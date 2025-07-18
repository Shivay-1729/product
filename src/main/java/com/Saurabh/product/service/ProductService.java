package com.Saurabh.product.service;

import com.Saurabh.product.requestModel.ProductRequest;
import com.Saurabh.product.responseModel.ProductResponse;

import java.util.List;

public interface ProductService {
    public List<ProductResponse> getAllProduct();
    public ProductResponse getProduct(String name);
    public ProductResponse addProduct(ProductRequest request);
    public ProductResponse updateProduct(ProductRequest request,String name);
    public void deleteProduct(String name);
}
