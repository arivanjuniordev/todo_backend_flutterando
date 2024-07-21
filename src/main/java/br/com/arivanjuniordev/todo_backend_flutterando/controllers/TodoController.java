package br.com.arivanjuniordev.todo_backend_flutterando.controllers;

import br.com.arivanjuniordev.todo_backend_flutterando.dtos.TodoDto;
import br.com.arivanjuniordev.todo_backend_flutterando.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {
        @Autowired
        private TodoService todoService;

        @GetMapping
        public ResponseEntity<List<TodoDto>> getAll() {
            return ResponseEntity.ok(todoService.getAll());
        }

        @GetMapping("/{id}")
        public ResponseEntity<TodoDto> getById(@PathVariable Long id) {
            return ResponseEntity.ok(todoService.getById(id));
        }

        @PostMapping
        public ResponseEntity<TodoDto> save(@RequestBody TodoDto todoDto) {
            return ResponseEntity.ok(todoService.save(todoDto));
        }

        @PutMapping
        public ResponseEntity<TodoDto> update(@RequestBody TodoDto todoDto) {
            return ResponseEntity.ok(todoService.update(todoDto));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(@PathVariable Long id) {
            todoService.delete(id);
            return ResponseEntity.ok().build();
        }
}
