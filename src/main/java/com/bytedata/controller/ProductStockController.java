package com.bytedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bytedata.beans.ProductStockBean;
import com.bytedata.entity.ProductStock;
import com.bytedata.entity.ProductStockRepository;

@RestController
public class ProductStockController {
	@Autowired
	ProductStockRepository productStockRepository;
	@Autowired
	Environment environment;

	@GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
	public ProductStockBean checkProductStock(@PathVariable String productName,
											  @PathVariable String productAvailability) {
		ProductStock productStock = productStockRepository.findByProductNameAndProductAvailability(productName,
				productAvailability);
		ProductStockBean productStockBean = new ProductStockBean(
				productStock.getId(),
				productStock.getProductName(),
				productStock.getProductPrice(),
				productStock.getProductAvailability(),
				productStock.getDiscountOffer(),
			Integer.parseInt(environment.getProperty("local.server.port"))
		);
		return productStockBean;
		
	}
}
