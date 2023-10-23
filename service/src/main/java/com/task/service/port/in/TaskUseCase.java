package com.task.service.port.in;

import com.task.service.adapter.web.dto.TaskRequest;
import com.task.service.domain.model.Task;
import java.util.List;

public interface TaskUseCase {
  Task createTask(TaskRequest task);

  List<Task> getAllTasks();

  Task getTaskById(Long taskId);

  Task updateTask(TaskRequest task);

  void deleteTask(Long taskId);
}
