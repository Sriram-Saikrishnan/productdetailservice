package com.example.productdetailservice;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.GeneratedValue;
import java.math.BigInteger;
import java.util.UUID;

@Data
@Document
public class Entity {
    @Id
    @GeneratedValue
    public BigInteger id;

    public UUID productId;

    public String name;
    public double price;
    public double rating;
    public String imageURL;
    public String description;


}
