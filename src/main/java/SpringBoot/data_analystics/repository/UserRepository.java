package SpringBoot.data_analystics.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.data_analystics.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}