package MyfirstCrud.springcrud.repository;

import MyfirstCrud.springcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
