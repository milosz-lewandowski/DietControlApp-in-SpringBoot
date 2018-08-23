package pl.dietapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dietapp.demo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
