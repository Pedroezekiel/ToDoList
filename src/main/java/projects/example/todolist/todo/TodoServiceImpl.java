package projects.example.todolist.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;
import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoServiceImpl implements TodoService{


    private final ModelMapper mapper;

    private final TaskRepository taskRepository;



    public TaskResponse createTask(TaskRequest taskRequest) throws Exception{

        Todo todo = Todo.builder().task(taskRequest.task).build();

        taskRepository.save(todo);

        return TaskResponse.builder().message("passed").build();

    }

}
