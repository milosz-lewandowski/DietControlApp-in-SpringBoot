package pl.dietapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dietapp.demo.entity.Category;
import pl.dietapp.demo.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findAllByCategories(Category category);
    public List<Product> findProductsByNameIsLike(String string);
}
