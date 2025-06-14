package io.github.jaovcarvalho.springarchitecture.todos.component;

import io.github.jaovcarvalho.springarchitecture.todos.model.entity.Todo;
import io.github.jaovcarvalho.springarchitecture.todos.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void Validate(Todo todo){
        if(existsTodoWithDescription(todo.getDescription())){
            throw new IllegalArgumentException("There is already a ToDo with this description!");
        }
    }

    private Boolean existsTodoWithDescription(String description){
        return repository.existsByDescription(description);
    }
}
