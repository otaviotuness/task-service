package com.task.service.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDate createdDate;
    private LocalDate completionDate;
    private TaskStatus status;

    public void markAsCompleted() {
        this.status = TaskStatus.COMPLETED;
        this.completionDate = LocalDate.now();
    }
}
