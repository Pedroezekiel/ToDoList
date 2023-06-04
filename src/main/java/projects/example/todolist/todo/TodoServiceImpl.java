package projects.example.todolist.todo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.example.todolist.todo.dtos.TaskRequest;
import projects.example.todolist.todo.dtos.TaskResponse;
import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoServiceImpl implements TodoService{


    private final ModelMapper mapper;

    public void createTask(TaskRequest taskRequest) throws Exception{

        Todo todo = mapper.map(taskRequest, Todo.class);

    }

}
