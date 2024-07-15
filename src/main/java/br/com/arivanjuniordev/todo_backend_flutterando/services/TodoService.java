package br.com.arivanjuniordev.todo_backend_flutterando.services;

import br.com.arivanjuniordev.todo_backend_flutterando.adapter.TodoAdapter;
import br.com.arivanjuniordev.todo_backend_flutterando.dtos.TodoDto;
import br.com.arivanjuniordev.todo_backend_flutterando.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<TodoDto> getAll() {

        return todoRepository.findAll().stream()
                .map(TodoAdapter::toDto)
                .collect(Collectors.toList());
    }

    public TodoDto save(TodoDto todoDto) {
        return TodoAdapter.toDto(todoRepository.save(TodoAdapter.toEntity(todoDto)));
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }

    public TodoDto update(TodoDto todoDto) {
        return TodoAdapter.toDto(todoRepository.save(TodoAdapter.toEntity(todoDto)));
    }

    public TodoDto getById(Long id) {
        return TodoAdapter.toDto(todoRepository.findById(id).get());
    }


}
