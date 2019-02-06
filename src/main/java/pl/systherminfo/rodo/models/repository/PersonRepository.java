package pl.systherminfo.rodo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.systherminfo.rodo.models.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
