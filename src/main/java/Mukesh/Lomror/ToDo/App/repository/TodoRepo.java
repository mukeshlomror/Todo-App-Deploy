package Mukesh.Lomror.ToDo.App.repository;

import Mukesh.Lomror.ToDo.App.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TodoRepo {

    List<Todo> todos = new ArrayList<>();
    public List<Todo> getAllTodos() {
        return todos;
    }


    public void addTodos(Todo mytodos) {
        todos.add(mytodos);
    }

    public List<Todo> updateTodos(Integer id) {
        List<Todo> templist = new ArrayList<>();
        for(Todo todo:todos){
            if(todo.getTodoId().equals(id)){
                todo.setTodoStatus(true);
                templist.add(todo);
            }
        }
        return templist;
    }

    public void deleteTodo(Integer id) {
        List<Todo> copy = todos;
        for(Todo todo : copy){
            if(todo.getTodoId().equals(id)){
                copy.remove(todo);
                break;
            }
        }
    }

    public void addAllTodos(List<Todo> mytodos) {
        for(Todo todo : mytodos){
            todos.add(todo);
        }
    }
}
