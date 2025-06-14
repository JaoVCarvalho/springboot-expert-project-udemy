package io.github.jaovcarvalho.springarchitecture.todos.controller;

import io.github.jaovcarvalho.springarchitecture.todos.model.entity.Todo;
import io.github.jaovcarvalho.springarchitecture.todos.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public Todo save(@RequestBody Todo todo){
        try{
            return service.save(todo);
        } catch (IllegalArgumentException ex){
            throw new ErrorResponseException(HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/{id}")
    public Todo findById(@PathVariable Integer id){
        return service.findById(id);
    }
}
