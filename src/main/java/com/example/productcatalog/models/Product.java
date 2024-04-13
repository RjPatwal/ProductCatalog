package com.example.productcatalog.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends  BaseModel{

    private String desc;
    private Double price;
    private String name;
    private String imageUrl;
    private  Category category;

}
