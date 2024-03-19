package Model;

import Dto.TodolistDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nameColaborador;
    private String optionTodoList;

    public TodoList(long id, String nameColaborador, String optionTodoList) {
        this.id = id;
        this.nameColaborador = nameColaborador;
        this.optionTodoList = optionTodoList;
    }

    public TodoList() {
    }

    public TodolistDTO toDTO() {
        TodolistDTO todolist = new TodolistDTO();

        todolist.setId(this.id);
        todolist.setOptionTodoList(this.optionTodoList);
        todolist.setNameColaborador(this.nameColaborador);

        return todolist;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameColaborador() {
        return nameColaborador;
    }

    public void setNameColaborador(String nameColaborador) {
        this.nameColaborador = nameColaborador;
    }

    public String getOptionTodoList() {
        return optionTodoList;
    }

    public void setOptionTodoList(String optionTodoList) {
        this.optionTodoList = optionTodoList;
    }

    {

    }

}

