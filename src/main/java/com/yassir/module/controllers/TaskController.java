package com.yassir.module.controllers;

import com.yassir.module.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.yassir.module.services.taskService;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private taskService taskService;
    @Autowired
    public TaskController(taskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId) {
        return taskService.getTaskById(taskId);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        // Add any necessary validation or processing before creating the task
        return taskService.createTask(task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        // Add any necessary validation or processing before updating the task
        task.setId(taskId); // Ensure the task ID matches the path variable
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskService.deleteTask(taskId);
    }
}

