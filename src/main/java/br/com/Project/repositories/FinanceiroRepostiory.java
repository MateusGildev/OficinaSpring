package br.com.Project.repositories;

import br.com.Project.Model.Financeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceiroRepostiory extends JpaRepository<Financeiro, Integer>{
}
