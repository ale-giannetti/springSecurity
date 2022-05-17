package it.unikey.jwtproject.DAL.domain.repo;

import it.unikey.jwtproject.DAL.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
