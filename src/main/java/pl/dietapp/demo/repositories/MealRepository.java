package pl.dietapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dietapp.demo.entity.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
}
