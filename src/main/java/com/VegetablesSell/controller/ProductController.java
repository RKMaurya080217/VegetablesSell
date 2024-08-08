package com.VegetablesSell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VegetablesSell.entity.Product;
import com.VegetablesSell.entity.User;
import com.VegetablesSell.service.ProductService;
import com.VegetablesSell.service.UserService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		User seller = userService.getUserById(product.getSeller().getUserId());

		if (seller == null || !"SELLER".equalsIgnoreCase(seller.getRole())) {
			return ResponseEntity.status(403).body("Only sellers can add products.");
		}

		product.setTotalPriceByQuantity(productService.totalPrice(product));
		product.setSeller(seller);
		Product savedProduct = productService.saveProduct(product);
		return ResponseEntity.ok(savedProduct);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id) {
		return productService.getProduct(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		return ResponseEntity.ok(productService.getAllProducts());
	}

	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {

		if (!productService.existsById(product.getProductId())) {
			return ResponseEntity.status(404).body("Product with ID " + product.getProductId() + " does not exist.");
		}

		Product updatedProduct = productService.updateProduct(product);
		return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
}