package fr.mns.springbootdemo.service;


import fr.mns.springbootdemo.persistence.model.Task;
import fr.mns.springbootdemo.persistence.repositery.TaskRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class TaskService {


    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<Task> findAll() {
        return taskRepository.findAll();
    }


    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}