package com.example.productdetailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/ecommerce/products")
public class Controller {

    @Autowired
     ProductService productService;

    @PostMapping("/save")
    public Entity saveData(@RequestBody Entity product){
        return productService.saveDataToDB(product);
    }

    @GetMapping("/getallproducts")
    public ArrayList<Entity> getAllProducts(){
     return productService.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public Entity getProductById(@PathVariable UUID productId){
    return productService.getProductDetails(productId);
    }
}

