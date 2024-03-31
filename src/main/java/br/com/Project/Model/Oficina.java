package br.com.Project.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_oficina")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private final LocalDate dataOs = LocalDate.now();

    @ManyToMany
    @JoinTable(name = "oficina_peca", joinColumns = @JoinColumn(name = "oficina_id"),inverseJoinColumns = @JoinColumn(name = "peca_id"))
    private List<Peca> pecas;

    @NotNull
    @NotBlank
    @Size(max = 64)
    private String descricaoOs;
}
