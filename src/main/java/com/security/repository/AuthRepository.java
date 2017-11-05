package repository;

import domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


public interface AuthRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}
