package com.telusko.simpleWebApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"canonCamera",70000),
//            new Product(103,"mic",10000)));
    public List<Product> getProducts(){
//        return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId()==prodId)
//                .findFirst().orElse(new Product(100,"No Item", 0));
//

//        for(Product p:products){
//            if(p.getProdId()==prodId){
//                return p;
//            }
//        }
//        return null;
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProdduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prod.getProdId())
//                index=i;
//        }
//         products.set(index,prod);

        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prodId)
//                index=i;
//        }
//        products.remove(index);
        repo.deleteById(prodId);
    }
}

