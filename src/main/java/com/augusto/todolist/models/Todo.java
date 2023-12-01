package com.augusto.todolist.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  
  private String name;
  private String description;
  private Boolean completed;
  private Integer priority;
}
