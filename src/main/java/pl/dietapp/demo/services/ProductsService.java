package pl.dietapp.demo.services;

import org.springframework.ui.Model;
import pl.dietapp.demo.entity.Product;

import java.util.List;

public interface ProductsService {
    public List<Product> getProductsList();
    public void saveProduct(Product product);
}
