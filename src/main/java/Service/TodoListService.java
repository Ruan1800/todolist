package Service;
import Dto.TodolistDTO;
import Model.TodoList;
import Repository.TodoListRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public TodolistDTO addTodolist(TodolistDTO todolistDTO) {
        this.addTodolist(todolistDTO);

        TodoList todoList = todolistDTO.toEntity();
        TodoList todolistSave = this.todoListRepository.save(todoList);

        return todolistSave.toDTO();



    }

}
