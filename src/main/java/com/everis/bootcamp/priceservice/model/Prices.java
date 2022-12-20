package com.everis.bootcamp.priceservice.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prices")
public class Prices {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="code_product")
	private String code_product;

	@Column(name="description")
	private String description;

	@Column(name="price")
	private BigDecimal price;

	public Prices() {
		super();
		this.id = -1;
		this.code_product = "NONE";
		this.description = "NONE";
		this.price = new BigDecimal(0.0);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode_product() {
		return code_product;
	}

	public void setCode_product(String code_product) {
		this.code_product = code_product;
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

}