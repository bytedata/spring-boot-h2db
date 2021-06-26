package com.bytedata.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {
	ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);
}
