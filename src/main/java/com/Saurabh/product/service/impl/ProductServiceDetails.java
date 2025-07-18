package com.Saurabh.product.service.impl;

import com.Saurabh.product.entity.Product;
import com.Saurabh.product.repository.ProductRepository;
import com.Saurabh.product.requestModel.ProductRequest;
import com.Saurabh.product.responseModel.ProductResponse;
import com.Saurabh.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceDetails implements ProductService {
    @Autowired
    ProductRepository repo;
    @Override
    public List<ProductResponse> getAllProduct() {
        List<Product> products = repo.findAll ();

       List<ProductResponse> product =  new ArrayList<> ();

        for(Product p:products){
            ProductResponse res = new ProductResponse ();
            res.setProductName (p.getName ());
            product.add (res);
        }
      return product;
    }

    @Override
    public ProductResponse getProduct(String name) {
        return null;
    }

    @Override
    public ProductResponse addProduct(ProductRequest request) {
        Product p = new Product ();
        p.setName (request.getName ());
        p.setBrand (request.getBrand ());
        p.setPrice (request.getPrice ());
        p.setQuantity (request.getQuantity ());

     Product product = repo.save (p);
     ProductResponse res = new ProductResponse ();
     res.setProductName (product.getName ());
     return res;
    }

    @Override
    public ProductResponse updateProduct(ProductRequest request,String name) {
        Product product = repo.findByName(name);
        product.setName (request.getName ());
        product.setBrand (request.getBrand ());
        product.setPrice (request.getPrice ());
        product.setQuantity (request.getQuantity ());
        Product p = repo.save (product);
        ProductResponse res = new ProductResponse ();
        res.setProductName (product.getName ());
        return res;
    }

    @Override
    public void deleteProduct(String name) {
        Product product = repo.findByName(name);
        repo.delete (product);

    }
}
