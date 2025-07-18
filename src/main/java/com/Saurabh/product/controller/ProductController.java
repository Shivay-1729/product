package com.Saurabh.product.controller;

import com.Saurabh.product.requestModel.ProductRequest;
import com.Saurabh.product.responseModel.ProductResponse;
import com.Saurabh.product.service.ProductService;
import com.Saurabh.product.service.impl.ProductServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<ProductResponse> getAllProduct(){
        return service.getAllProduct ();
    }

    @PostMapping("/product")
    public  ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest request){
       ProductResponse res = service.addProduct (request);
       return ResponseEntity.ok(res);
    }

    @PutMapping("/product/{name}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable String name,@RequestBody ProductRequest request){
        ProductResponse res = service.updateProduct (request,name);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/product/{name}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String name){
        service.deleteProduct (name);
        return ResponseEntity.ok().build ();
    }
}
