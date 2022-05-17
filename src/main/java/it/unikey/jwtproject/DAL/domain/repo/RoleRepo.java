package it.unikey.jwtproject.DAL.domain.repo;

import it.unikey.jwtproject.DAL.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
