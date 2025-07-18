package com.Saurabh.product.requestModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
    private String name;
    private String brand;
    private long price;
    private int quantity;
}
