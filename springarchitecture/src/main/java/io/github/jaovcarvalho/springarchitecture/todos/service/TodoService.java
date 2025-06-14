package io.github.jaovcarvalho.springarchitecture.todos.service;

import io.github.jaovcarvalho.springarchitecture.todos.component.TodoValidator;
import io.github.jaovcarvalho.springarchitecture.todos.model.entity.Todo;
import io.github.jaovcarvalho.springarchitecture.todos.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;

    public TodoService(TodoRepository repository, TodoValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public Todo findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public Todo save(Todo todo){
        validator.Validate(todo);
        return repository.save(todo);
    }

}
