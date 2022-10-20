package ops.rc.sistemacondominio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "problemas")
public class Problema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "nome_problema")
    private String problema;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_resolucao")
    private Date dataResolucao;

    @Column(name = "descricao_problema")
    private String descricao;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "situacao_problema", nullable = false)
    private SituacaoProblema situacaoProblema;
}
