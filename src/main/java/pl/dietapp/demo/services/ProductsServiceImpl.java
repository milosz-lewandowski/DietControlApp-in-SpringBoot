package pl.dietapp.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dietapp.demo.entity.Product;
import pl.dietapp.demo.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProductsList() {
        return productRepository.findAll();
    }

}
