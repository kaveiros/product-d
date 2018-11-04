package com.drivas.domain;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class Product {
	
	private Integer idProduct;
	
	private String description;
	
	private BigDecimal price;
	
	private String URL;

	public Integer getId() {
		return idProduct;
	}

	public void setId(Integer id) {
		this.idProduct = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	 

}
