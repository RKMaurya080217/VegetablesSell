package com.VegetablesSell.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String type;
    
    @Column(nullable = false)
    private int quantity;
    
    @Column(nullable = false)
    private BigDecimal price;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id", nullable = false)
    private User seller;
    
    @Column(nullable = false)
    private Date dateListed;
    
    
    @Column(nullable = false)
    private BigDecimal totalPriceByQuantity;

    // Getters and Setters
    
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller2) {
		this.seller = seller2;
	}

	public Date getDateListed() {
		return dateListed;
	}

	public void setDateListed(Date dateListed) {
		this.dateListed = dateListed;
	}
	

	public BigDecimal getTotalPriceByQuantity() {
		return totalPriceByQuantity;
	}

	public void setTotalPriceByQuantity(BigDecimal totalPriceByQuantity) {
		this.totalPriceByQuantity = totalPriceByQuantity;
	}
	
	public Product(Long productId, String name, String type, int quantity, BigDecimal price,
			BigDecimal totalPriceByQuantity, User seller, Date dateListed) {
		super();
		this.productId = productId;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		this.totalPriceByQuantity = totalPriceByQuantity;
		this.seller = seller;
		this.dateListed = dateListed;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}