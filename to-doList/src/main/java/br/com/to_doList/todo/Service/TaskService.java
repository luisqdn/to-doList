package br.com.to_doList.todo.Service;

import br.com.to_doList.todo.repositorio.TaskRepository;
import br.com.to_doList.todo.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Optional<Task> getTaskByID(Long id){
        return taskRepository.findById(id);
    }
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }
}
