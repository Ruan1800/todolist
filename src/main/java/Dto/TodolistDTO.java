package Dto;

import Model.TodoList;

public class TodolistDTO {

    private long id;
    private String nameColaborador;
    private String optionTodoList;

    public TodolistDTO(){

    }

    public TodoList toEntity() {
        TodoList todolist = new TodoList();
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
}
