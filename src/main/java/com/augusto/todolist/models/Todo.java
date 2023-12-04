package com.augusto.todolist.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "todos")
@Getter
@Setter
public class Todo {

  public Todo(String name, String description, Boolean completed, Integer priority) {
    this.name = name;
    this.description = description;
    this.completed = completed;
    this.priority = priority;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @NotBlank
  private String name;

  @NotBlank
  private String description;
  private Boolean completed;
  private Integer priority;
}
