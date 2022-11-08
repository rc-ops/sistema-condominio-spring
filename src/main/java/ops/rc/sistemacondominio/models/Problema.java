package ops.rc.sistemacondominio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "problemas")
public class Problema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", updatable = false)
    private int codigo;

    @Column(name = "nome_problema", length = 50, nullable = false)
    @NotEmpty(message = "É preciso inseir um nome para o problema")
    @Size(max = 50, message = "O nome do problema não pode exceder 50 caracteres")
    private String problema;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_resolucao")
    private LocalDate dataResolucao;

    @Column(name = "descricao_problema", length = 150, nullable = false)
    @NotEmpty(message = "É preciso adicionar uma descrição para o problema")
    @Size(max = 150, message = "A descrição do problema não pode exceder 150 caracteres")
    private String descricao;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "situacao_problema", nullable = false, length = 15)
    private SituacaoProblema situacaoProblema;
}
