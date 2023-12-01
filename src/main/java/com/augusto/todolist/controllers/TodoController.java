package com.augusto.todolist.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.augusto.todolist.models.Todo;
import com.augusto.todolist.services.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
  
  @Autowired
  private TodoService todoService;

  @PostMapping
  public List<Todo> create(@RequestBody Todo todo) {
    return todoService.create(todo);
  }

  @GetMapping
  public List<Todo> list() {
    return todoService.list();
  }

  @PutMapping
  public List<Todo> update(@RequestBody Todo todo) {
    return todoService.update(todo);
  }

  @DeleteMapping("{id}")
  public List<Todo> delete(@PathVariable("id") UUID id) {
    return todoService.delete(id);
  }
}
