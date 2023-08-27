package com.curso.product.rest;

import java.util.List;
import java.util.Optional;

import com.curso.product.dao.ProductsDao;
import com.curso.product.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productos")
public class ProductRest {
	
	@Autowired
	private ProductsDao productoDao;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProduct() {
		
		List<Product> productos = productoDao.findAll();
		return ResponseEntity.ok(productos);
	}
	
	@RequestMapping(value = "{idProducto}")
	public ResponseEntity<Product> getProductId(@PathVariable("idProducto")Long productoId) {
		
		Optional<Product> productoOptional = productoDao.findById(productoId);
		if(productoOptional.isPresent()) {
			return ResponseEntity.ok(productoOptional.get());
			
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Product> crearProducto(@RequestBody Product producto){
		
		Product nuevoProducto = productoDao.save(producto);
		return ResponseEntity.ok(nuevoProducto);
		
	}
	
	@DeleteMapping(value = "{idProducto}")
	public ResponseEntity<Void> eliminarProducto(@PathVariable("idProducto")Long productoId) {
		productoDao.deleteById(productoId);
	
		return ResponseEntity.ok(null);
		
	}
}
