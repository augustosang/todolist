package com.augusto.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.augusto.todolist.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, UUID>{
}
