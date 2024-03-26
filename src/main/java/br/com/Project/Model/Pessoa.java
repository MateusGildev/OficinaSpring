package br.com.Project.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "tb_pessoa")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String nome;

    @OneToOne
    private Viagem viagem;

    @Positive
    @Min(18)
    private int idade;

    @Column(unique = true, nullable = false)
    @JsonFormat(pattern = "###.###.###-##")
    private Integer cpf;
}
