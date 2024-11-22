package in.raghab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	private ProductDao product;
	
	public ProductService(ProductDao product) {
		System.out.println("ProductService::Constructor");
	}
	public void save() {
		product.saveProduct();
	}
	
}
