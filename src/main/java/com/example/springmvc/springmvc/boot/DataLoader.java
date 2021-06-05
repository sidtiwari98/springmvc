package com.example.springmvc.springmvc.boot;

import com.example.springmvc.springmvc.model.Product;
import com.example.springmvc.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product phone1 = new Product();
        phone1.setName("iPhone 12");
        phone1.setDescription("Newest iPhone in the market");
        phone1.setCategory("Electric Appliances");
        phone1.setPrice(1000.0);
        phone1.setType("Phone");

        productRepository.save(phone1);

        Product phone2 = new Product();
        phone2.setName("Samsung Galaxy");
        phone2.setDescription("Top phone in market");
        phone2.setCategory("Electric Appliances");
        phone2.setPrice(900.0);
        phone2.setType("Phone");

        productRepository.save(phone2);

    }
}
