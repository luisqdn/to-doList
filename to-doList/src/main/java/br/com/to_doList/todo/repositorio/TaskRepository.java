package br.com.to_doList.todo.repositorio;

import br.com.to_doList.todo.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
