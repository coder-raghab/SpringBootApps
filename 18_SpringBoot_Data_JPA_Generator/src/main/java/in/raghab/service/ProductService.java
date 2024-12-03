package in.raghab.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghab.repo.ProductRepo;
import in.raghab.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	public void saveProduct() {
		Product product=new Product();
		product.setOrderedBy("Sita Ram");
		product.setOrderPlacedDate(new Date());
		
		productRepo.save(product);
	}
}
