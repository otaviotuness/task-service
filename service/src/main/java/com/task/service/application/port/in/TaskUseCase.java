package com.task.service.application.port.in;

import com.task.service.domain.model.Task;

import java.util.List;

public interface TaskUseCase {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long taskId);
    Task updateTask(Long taskId, String title, String description);
    void deleteTask(Long taskId);
}
