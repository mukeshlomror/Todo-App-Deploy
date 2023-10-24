package Mukesh.Lomror.ToDo.App.service;

import Mukesh.Lomror.ToDo.App.model.Todo;
import Mukesh.Lomror.ToDo.App.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepo todoRepo;
    public List<Todo> getAllTodos() {
        return todoRepo.getAllTodos();
    }

    public void addTodos(Todo todos) {
        todoRepo.addTodos(todos);
    }

    public List<Todo> updateTodos(Integer id) {
        return todoRepo.updateTodos(id);
    }

    public void deleteTodo(Integer id) {
        todoRepo.deleteTodo(id);
    }

    public void addAllTodos(List<Todo> mytodos) {
        todoRepo.addAllTodos(mytodos);
    }
}
