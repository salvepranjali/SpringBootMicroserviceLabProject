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

@AllArgsConstructor//  it generates a constructor with one parameter for every field in the class
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product")//create a table 
public class Product {
	@Id// it is use to create primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	//create the variable
	private Integer productId;
	private String productName;
	private Integer price;

}
