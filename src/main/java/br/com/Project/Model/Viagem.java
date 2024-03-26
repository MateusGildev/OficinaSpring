package br.com.Project.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_viagem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViagem;

    @FutureOrPresent
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataViagem;

    @ManyToOne
    private Financeiro financeiro;

    private String destino;
}
