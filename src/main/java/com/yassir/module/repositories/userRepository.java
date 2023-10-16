package com.yassir.module.repositories;


import com.yassir.module.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userRepository extends JpaRepository<User,Long> {
}
