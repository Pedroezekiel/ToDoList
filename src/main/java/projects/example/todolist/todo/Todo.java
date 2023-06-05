package projects.example.todolist.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

@RequiredArgsConstructor
@Entity
@AllArgsConstructor
@Builder
@Data
public class Todo {

    @Id
    @UuidGenerator
    private String id;

    private String task;

    private boolean done = false;

}
