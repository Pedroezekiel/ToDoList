package projects.example.todolist.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Builder
public class Todo {

    @Id
    @UuidGenerator
    private long id;

    private String task;

    private boolean done = false;

}
