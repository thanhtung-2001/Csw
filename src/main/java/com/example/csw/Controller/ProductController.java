package com.example.csw.Controller;

import com.example.csw.model.Product;
import com.example.csw.repository.ProductRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/product")
public class ProductController {
    @Autowired
    ProductRepsitory productRepsitory;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepsitory.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product product1 = productRepsitory.save(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }
}