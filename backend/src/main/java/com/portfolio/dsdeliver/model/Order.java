package com.portfolio.dsdeliver.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.portfolio.dsdeliver.domain.OrderStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_order")
@NoArgsConstructor
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String address;
	private double longitude;
	private double latitude;
	private Instant moment;
	private OrderStatus status;

	@ManyToMany
	@JoinTable(name = "tb_order_product", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Set<Product> products = new HashSet<>();

	public Order(Long id, String address, double longitude, double latitude, Instant moment, OrderStatus status) {
		super();
		this.id = id;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
		this.moment = moment;
		this.status = status;
	}

	public Order addproduct(Product p) {
		this.getProducts().add(p);
		return this;
	}

	public Order delivered() {
		this.setStatus(OrderStatus.DELIVERED);
		return this;
	}

}
