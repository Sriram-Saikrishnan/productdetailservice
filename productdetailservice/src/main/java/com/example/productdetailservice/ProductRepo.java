package com.example.productdetailservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface ProductRepo extends MongoRepository<Entity, BigInteger> {

    Entity save(Entity product);
    ArrayList<Entity> findAll();
    Entity findByproductId(UUID productId);

}
