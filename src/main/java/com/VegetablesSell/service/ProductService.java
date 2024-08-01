package com.VegetablesSell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VegetablesSell.entity.Product;
import com.VegetablesSell.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product getProductById(Long productId) {
		return productRepository.findByProductId(productId);
		// .orElseThrow(() -> new UsernameNotFoundException("User not found with id " +
		// userId));
	}
	

	public boolean existsById(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.existsById(productId);

	}

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Optional<Product> getProduct(Long productId) {
		return productRepository.findById(productId);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
	}

}