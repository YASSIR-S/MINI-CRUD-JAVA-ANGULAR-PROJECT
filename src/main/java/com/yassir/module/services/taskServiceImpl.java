package com.yassir.module.services;

import com.yassir.module.entities.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.yassir.module.repositories.taskRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class taskServiceImpl implements taskService {

    private taskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public Task getTaskById(Long taskId) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long taskId) {

    }
}
