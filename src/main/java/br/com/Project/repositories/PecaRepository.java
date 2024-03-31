package br.com.Project.repositories;

import br.com.Project.Model.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Integer> {
    List findById(int pecaId);
}
