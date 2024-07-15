package br.com.arivanjuniordev.todo_backend_flutterando.adapter;

import br.com.arivanjuniordev.todo_backend_flutterando.domain.Todo;
import br.com.arivanjuniordev.todo_backend_flutterando.dtos.TodoDto;

public class TodoAdapter {
    public static TodoDto toDto(Todo todo) {
        return new TodoDto(todo.getId(), todo.getTitle(), todo.getDone());
    }

    public static Todo toEntity(TodoDto todoDto) {
        Todo todo = new Todo();
        todo.setId(todoDto.id());
        todo.setTitle(todoDto.title());
        todo.setDone(todoDto.done());
        return todo;
    }
}
