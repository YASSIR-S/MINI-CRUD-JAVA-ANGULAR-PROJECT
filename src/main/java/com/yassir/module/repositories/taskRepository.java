package com.yassir.module.repositories;

import com.yassir.module.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface taskRepository extends JpaRepository<Task,Long> {
}
