package projects.example.todolist.todo;

import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;

public interface TodoService {
    TaskResponse createTask(TaskRequest taskRequest) throws Exception;

    Todo getTask(String id) throws Exception;

    TaskResponse deleteTask(String id) throws Exception;

    TaskResponse doneTask(String id) throws Exception;

}
