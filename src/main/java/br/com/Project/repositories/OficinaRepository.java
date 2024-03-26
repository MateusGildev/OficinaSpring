package br.com.Project.repositories;

import br.com.Project.Model.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Integer> {
}
