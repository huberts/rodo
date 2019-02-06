package pl.systherminfo.rodo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.systherminfo.rodo.models.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
