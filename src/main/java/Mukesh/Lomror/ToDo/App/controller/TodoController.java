package Mukesh.Lomror.ToDo.App.controller;

import Mukesh.Lomror.ToDo.App.model.Todo;
import Mukesh.Lomror.ToDo.App.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("getTodos")
    public List<Todo> getAllTodos(){
       return todoService.getAllTodos();
    }

    @PostMapping("addTodo")
    public String addTodos(@RequestBody Todo todos){
        todoService.addTodos(todos);
        return "todos are added successfully";
    }

    @PostMapping("addTodos")
    public String addAllTodos(@RequestBody List<Todo> mytodos){
        todoService.addAllTodos(mytodos);
        return "todos are added successfully";
    }
    @PutMapping("todoid/{id}")
    public List<Todo> updateTodos(@PathVariable Integer id){
        return todoService.updateTodos(id);
    }
    @DeleteMapping("delete/{id}")
    public String deleteTodo(@PathVariable Integer id){
        todoService.deleteTodo(id);
        return "todo is successfully deleted";
    }

}
