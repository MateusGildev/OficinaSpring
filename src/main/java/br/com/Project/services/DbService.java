package br.com.Project.services;

import br.com.Project.Model.*;
import br.com.Project.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbService {

    @Autowired
    private FinanceiroRepostiory financeiroRepostiory;

    @Autowired
    private OficinaRepository oficinaRepository;


    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private ViagemRepository viagemRepository;


    public void initDB() {
        Financeiro financeiro1 = new Financeiro(null, 250.0, null);
        financeiroRepostiory.save(financeiro1);

        Viagem viagem1 = new Viagem(null, null, financeiro1, "Paraguai");
        viagemRepository.save(viagem1);

        Pessoa pessoa1 = new Pessoa(null, "Mateus", viagem1, 22, 836762647);
        pessoaRepository.save(pessoa1);


        Oficina oficina1 = new Oficina(null,"Teste oficina 1");
        oficinaRepository.save(oficina1);

        Veiculo veiculo1 = new Veiculo(null, "ABC123", viagem1, "Fiat", 2005);
        veiculoRepository.save(veiculo1);


    }
}
