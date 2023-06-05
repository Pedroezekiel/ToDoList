package projects.example.todolist.todo;

import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;

public interface TodoService {
    TaskResponse createTask(TaskRequest taskRequest) throws Exception;

}
