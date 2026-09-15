package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.ProductService;
import com.telusko.simpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService Service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return Service.getProductById(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        Service.addProdduct(prod);
    }

    @PutMapping("/products")
    public void updareProduct(@RequestBody Product prod) {
        Service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(int prodId) {
        Service.deleteProduct(prodId);
    }

}
