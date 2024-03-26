package br.com.Project.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_financeiro")
@NoArgsConstructor
@Getter
@Setter
public class Financeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVale;

    private Double valorVale;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataVale;

    public Financeiro(Integer idVale, Double valorVale, LocalDate dataVale) {
        this.idVale = idVale;
        this.valorVale = valorVale;
        this.dataVale = dataVale;
    }
}
