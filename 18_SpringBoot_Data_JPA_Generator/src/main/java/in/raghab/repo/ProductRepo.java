package in.raghab.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
