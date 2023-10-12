package services;

import entities.Task;

import java.util.List;

public interface taskService {
    Task createTask(Task task);
    Task getTaskById(Long taskId);
    List<Task> getAllTasks();
    Task updateTask(Task task);
    void deleteTask(Long taskId);
}
