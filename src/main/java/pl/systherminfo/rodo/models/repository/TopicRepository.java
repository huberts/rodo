package pl.systherminfo.rodo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.systherminfo.rodo.models.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
