package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@SpringBootApplication  //it is a configuration class
public class ProductcreateupdatedeleteApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductcreateupdatedeleteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//pass the value of the product 
		Product p1 = Product.builder().productName("Lenovo").price(30000).build();
		Product p2 = Product.builder().productName("Dell").price(35000).build();
		Product p3 = Product.builder().productName("HP").price(40000).build();
		Product p4 = Product.builder().productName("Acer").price(50000).build();

		//Save the Product object
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
		//Simply print the message
		System.out.println("All Data are saved--------");

	}

}
