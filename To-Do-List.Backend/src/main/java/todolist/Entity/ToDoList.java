package todolist.Entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.List;

@Entity
@Table(name = "todolist")
public class ToDoList {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Column(columnDefinition = "TEXT") 
    private String tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getTasks() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(tasks, new TypeReference<List<String>>() {});
        } catch (IOException e) {
            return null;
        }
    }

    public void setTasks(List<String> tasks) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            this.tasks = objectMapper.writeValueAsString(tasks);
        } catch (IOException e) {
            this.tasks = "[]";
        }
    }
}
