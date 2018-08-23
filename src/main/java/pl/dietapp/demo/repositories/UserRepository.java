package pl.dietapp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dietapp.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
