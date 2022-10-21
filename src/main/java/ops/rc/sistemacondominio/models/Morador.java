package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "moradores")
public class Morador implements Serializable {
    @Id
    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String sobrenome;

    @Column(name = "telefones", length = 50)
    private String telefones;

    @Column(name = "emails", length = 50)
    private String emails;

    @Column(nullable = false)
    private int apartamento;

    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "pendencias", length = 200)
    private String pendencias;

    @Column(nullable = false, name = "situacao_morador", length = 11)
    @Enumerated(value = EnumType.STRING)
    private SituacaoMorador situacaoMorador;
}