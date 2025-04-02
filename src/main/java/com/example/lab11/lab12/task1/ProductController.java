package com.example.lab11.lab12.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @GetMapping("/filter")
    public List<Product> getProductsByPriceRange(
            @RequestParam double minPrice,
            @RequestParam double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }
}
