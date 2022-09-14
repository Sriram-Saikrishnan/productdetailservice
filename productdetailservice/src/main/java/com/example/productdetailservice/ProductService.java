package com.example.productdetailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {


    @Autowired
    ProductRepo productRepo;

    public Entity saveDataToDB(Entity product){
        product.setProductId(UUID.randomUUID());
       return productRepo.save(product);

    }
    public ArrayList<Entity> findAllProducts(){
      return productRepo.findAll();
    }

    public Entity getProductDetails(UUID productId){
        return productRepo.findByproductId(productId);
    }


}

