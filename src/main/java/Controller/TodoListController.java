package Controller;

import Dto.TodolistDTO;
import Service.TodoListService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/todolist")
public class TodoListController {

    private final TodoListService todoListService;

    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodolistDTO addTodolist(@RequestBody TodolistDTO todolist) {
        return this.todoListService.addTodolist(todolist);
    }


}
