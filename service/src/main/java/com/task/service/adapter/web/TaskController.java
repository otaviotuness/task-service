package com.task.service.adapter.web;

import com.task.service.adapter.web.dto.TaskRequest;
import com.task.service.domain.model.Task;
import com.task.service.port.in.TaskUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

  private final TaskUseCase taskUseCase;

  @PostMapping
  public Task createTask(@RequestBody TaskRequest request) {
    return taskUseCase.createTask(request);
  }

  @GetMapping
  public List<Task> getAllTasks() {
    return taskUseCase.getAllTasks();
  }

  @GetMapping("/{taskId}")
  public Task getTaskById(@PathVariable Long taskId) {
    return taskUseCase.getTaskById(taskId);
  }

  @PutMapping
  public Task updateTask(@RequestBody TaskRequest request) {
    return taskUseCase.updateTask(request);
  }

  @DeleteMapping("/{taskId}")
  public void deleteTask(@PathVariable Long taskId) {
    taskUseCase.deleteTask(taskId);
  }
}
