package com.curso.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProducto;
	
	@Column(name="name", nullable=false, length=30)
	private String nameProducto;
	
	public Long getIdProducto() {
		return this.idProducto;
	}
	
	public String getNameProducto() {
		return nameProducto;
	}
	
	public void setId(Long idProducto) {
		this.idProducto = idProducto;
	}
	
	public void setName(String nameProducto) {
		this.nameProducto = nameProducto;
	}
}
