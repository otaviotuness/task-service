package com.task.service.application.service;

import com.task.service.application.port.in.TaskUseCase;
import com.task.service.application.port.out.TaskRepository;
import com.task.service.domain.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskUseCase {

    private final TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId)
                .orElse(null); // Tratamento adequado para caso a tarefa não seja encontrada
    }

    @Override
    public Task updateTask(Long taskId, String title, String description) {
        Task existingTask = taskRepository.findById(taskId)
                .orElse(null); // Tratamento adequado para caso a tarefa não seja encontrada

        if (existingTask != null) {
            existingTask.setTitle(title);
            existingTask.setDescription(description);
            return taskRepository.save(existingTask);
        }

        return null;
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.delete(taskId);
    }
}
