package com.curso.product.rest;

import java.util.List;

import com.curso.product.entity.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productos")
public class ProductRest {
	
	/*@GetMapping
	public ResponseEntity<List<Product>> getProduc() {
		
		
		return ResponseEntity.ok(producto);
	}*/
}
