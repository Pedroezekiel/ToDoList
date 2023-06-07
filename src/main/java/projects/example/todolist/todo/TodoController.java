package projects.example.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private  TodoService todoService;

    @PostMapping("create/")
    public TaskResponse addTask(@RequestBody TaskRequest taskRequest) throws Exception {
        return todoService.createTask(taskRequest);

    }

    @GetMapping("get/{id}")
    public Todo getTask(@PathVariable String id) throws Exception {
        return todoService.getTask(id);
    }

    @DeleteMapping("get/{id}")
    public TaskResponse deleteTask(@PathVariable String id) throws  Exception{
        return todoService.deleteTask(id);
    }

    @PatchMapping("get/{id}")
    public TaskResponse doneTask(@PathVariable String id) throws Exception{
        return todoService.doneTask(id);
    }






}
