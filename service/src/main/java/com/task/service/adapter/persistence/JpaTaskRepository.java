package com.task.service.adapter.persistence;

import com.task.service.domain.model.Task;
import com.task.service.port.out.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<Task, Long>, TaskRepository {}
