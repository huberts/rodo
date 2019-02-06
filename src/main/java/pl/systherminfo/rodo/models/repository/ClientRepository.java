package pl.systherminfo.rodo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.systherminfo.rodo.models.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
