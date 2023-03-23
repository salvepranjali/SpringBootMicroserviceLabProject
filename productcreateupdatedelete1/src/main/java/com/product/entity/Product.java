package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // generates a constructor with 1 parameter for each field in your class
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product")
public class Product {
	@Id //create primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	//create the variable
	private Integer productId;
	private String productName;
	private Integer price;

}
