package com.augusto.todolist.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.augusto.todolist.models.Todo;
import com.augusto.todolist.repositories.TodoRepository;

@Service
public class TodoService {

  @Autowired
  private TodoRepository todoRepository;

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> list() {
    Sort sort = Sort.by("priority").descending().and(
      Sort.by("name").ascending()
    );
    return todoRepository.findAll(sort);
  }

  public List<Todo> update(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> delete(UUID id) {
    todoRepository.deleteById(id);
    return list();
  }
}
