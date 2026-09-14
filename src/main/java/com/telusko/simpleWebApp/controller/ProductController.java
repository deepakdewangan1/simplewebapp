package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.ProductService;
import com.telusko.simpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService Service;

    @RequestMapping("/Products")
    public List<Product> getProducts(){
        return Service.getProducts();
    }
}
