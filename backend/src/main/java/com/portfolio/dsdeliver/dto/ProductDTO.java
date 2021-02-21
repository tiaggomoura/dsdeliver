package com.portfolio.dsdeliver.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.portfolio.dsdeliver.model.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private BigDecimal price;
	private String description;
	private String imageUri;

	public ProductDTO(Long id, String name, BigDecimal price, String description, String imageUri) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}

	public ProductDTO(Product entity) {

		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imageUri = entity.getImageUri();
	}

}