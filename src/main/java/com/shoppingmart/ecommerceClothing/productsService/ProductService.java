package com.shoppingmart.ecommerceClothing.productsService;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
     @Autowired
    private ProductsDao productsDao;

public String  saveProductsService(Productsdto productsdto){
    return productsDao.saveProductsDAO(productsdto);
} 

    public Optional<Productsdto> getProductsdto(int i){
        return productsDao.getProductsdto(i);
    }

}
