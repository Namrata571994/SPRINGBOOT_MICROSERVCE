package com.euser.userservice.repository;

import com.euser.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByuserId(Long userId);

    // User saveUser(User user);
}
