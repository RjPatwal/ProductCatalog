package com.example.productcatalog.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends  BaseModel{

    private String desc;
    private String name;
    private List<Product> productList;

}
