package com.task.service.application.service;

import static com.task.service.domain.exception.TaskNotFoundException.notFoundWithId;

import com.task.service.adapter.web.dto.TaskRequest;
import com.task.service.domain.model.Task;
import com.task.service.port.in.TaskUseCase;
import com.task.service.port.out.TaskRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskUseCase {

  private final TaskRepository taskRepository;

  @Override
  public Task createTask(TaskRequest task) {
    final var taskToCreate =
        Task.builder()
            .title(task.getTitle())
            .description(task.getDescription())
            .createdDate(task.getCreatedDate())
            .completionDate(task.getCompletionDate())
            .status(task.getStatus())
            .build();
    return taskRepository.save(taskToCreate);
  }

  @Override
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  @Override
  public Task getTaskById(Long taskId) {
    return taskRepository.findById(taskId).orElseThrow(() -> notFoundWithId(taskId));
  }

  @Override
  public Task updateTask(TaskRequest task) {
    Task existingTask =
        taskRepository.findById(task.getId()).orElseThrow(() -> notFoundWithId(task.getId()));

    return taskRepository.save(existingTask);
  }

  @Override
  public void deleteTask(Long taskId) {
    taskRepository.deleteById(taskId);
  }
}
