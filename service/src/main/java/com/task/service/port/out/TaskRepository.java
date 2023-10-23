package com.task.service.port.out;

import com.task.service.domain.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {
  Optional<Task> findById(Long taskId);

  List<Task> findAll();

  Task save(Task task);

  void deleteById(Long taskId);
}
