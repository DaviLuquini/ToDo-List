package todolist.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todolist.Entity.ToDoList;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {
}
