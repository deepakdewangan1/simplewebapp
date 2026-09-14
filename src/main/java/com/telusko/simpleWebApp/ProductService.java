package com.telusko.simpleWebApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"canonCamera",70000),
            new Product(103,"mic",10000));
    public List<Product> getProducts(){
        return products;
    }

}

