package projects.example.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private  TodoService todoService;

    @PostMapping
    public TaskResponse addTask(@RequestBody TaskRequest taskRequest) throws Exception {
        return todoService.createTask(taskRequest);

    }


}
