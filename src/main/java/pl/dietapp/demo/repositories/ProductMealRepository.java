package pl.dietapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dietapp.demo.entity.ProductMeal;

@Repository
public interface ProductMealRepository extends JpaRepository<ProductMeal, Integer> {
}
