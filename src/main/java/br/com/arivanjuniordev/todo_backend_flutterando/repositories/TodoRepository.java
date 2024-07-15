package br.com.arivanjuniordev.todo_backend_flutterando.repositories;

import br.com.arivanjuniordev.todo_backend_flutterando.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
