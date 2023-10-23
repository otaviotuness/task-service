package com.task.service.adapter.web.dto;

import com.task.service.domain.model.TaskStatus;
import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TaskRequest {
  @NotBlank private Long id;

  @NotBlank(message = "Title is mandatory")
  private String title;

  private String description;
  private LocalDate createdDate;
  private LocalDate completionDate;

  @NotBlank(message = "Status is mandatory")
  private TaskStatus status;
}
