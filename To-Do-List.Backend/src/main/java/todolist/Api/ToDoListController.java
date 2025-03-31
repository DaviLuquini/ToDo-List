package todolist.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todolist.Entity.ToDoList;
import todolist.Infrastructure.ToDoListRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    @Autowired
    private ToDoListRepository toDoListRepository;

    // Criar uma nova lista de tarefas
    @PostMapping
    public ResponseEntity<ToDoList> createToDoList(@RequestBody ToDoList toDoList) {
        return ResponseEntity.ok(toDoListRepository.save(toDoList));
    }

    // Buscar todas as listas de tarefas
    @GetMapping
    public ResponseEntity<List<ToDoList>> getAllToDoLists() {
        return ResponseEntity.ok(toDoListRepository.findAll());
    }

    // Buscar uma lista específica por ID
    @GetMapping("/{id}")
    public ResponseEntity<ToDoList> getToDoListById(@PathVariable Long id) {
        Optional<ToDoList> toDoList = toDoListRepository.findById(id);
        return toDoList.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Atualizar uma lista de tarefas
    @PutMapping("/{id}")
    public ResponseEntity<ToDoList> updateToDoList(@PathVariable Long id, @RequestBody ToDoList newToDoList) {
        return toDoListRepository.findById(id).map(toDoList -> {
            toDoList.setTasks(newToDoList.getTasks());
            return ResponseEntity.ok(toDoListRepository.save(toDoList));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Deletar uma lista de tarefas
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteToDoList(@PathVariable Long id) {
        if (toDoListRepository.existsById(id)) {
            toDoListRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}