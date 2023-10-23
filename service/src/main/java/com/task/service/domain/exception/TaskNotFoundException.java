package com.task.service.domain.exception;

public class TaskNotFoundException extends RuntimeException {

  public TaskNotFoundException(String message) {
    super(message);
  }

  public static TaskNotFoundException notFoundWithId(long id) {
    String message = String.format("%s with ID %d not found", id);
    return new TaskNotFoundException(message);
  }
}
