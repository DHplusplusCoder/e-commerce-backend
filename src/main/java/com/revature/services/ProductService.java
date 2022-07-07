package com.revature.services;

import com.revature.dtos.ProductInfo;
import com.revature.models.Product;
import com.revature.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public List<Product> saveAll(List<Product> productList, List<ProductInfo> metadata) {
    	return productRepository.saveAll(productList);
    }

    public void delete(int id) {
        productRepository.deleteById(id);
    }
    
    public void BackendTranscribeProductFromServer(int id)
    {
        //Converts an entry from the server into an entity the website can display,
    }
    
    public void BackendConvertToFeaturedProduct(int id)
    {
        //Converts a regular product to a featured one
    }
    
    public void BackendConvertToRegularProduct(int id)
    {
        //Converts a featured product to a regular one.
    }
}
