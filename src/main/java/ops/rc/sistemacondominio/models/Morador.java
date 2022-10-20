package ops.rc.sistemacondominio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "moradores")
public class Morador implements Serializable {
    @Id
    @Column(nullable = false, length = 11)
    private String cpf;

    @OneToMany(mappedBy = "morador") // Nome do atributo na entidade Email que faz relacionamento com a classe Morador
    private HashSet<Email> emails;

    private String observacoes;

    private String email;

    @OneToMany(mappedBy = "morador")
    private HashSet<Telefone> telefones;

    @OneToMany(mappedBy = "morador")
    private HashSet<Pendencias> pendencias;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String sobrenome;

    @Column(nullable = false)
    private int apartamento;

    @OneToMany(mappedBy = "morador")
    private HashSet<Pagamentos> pagamentos;

    @Column(nullable = false, name = "situacao_morador")
    @Enumerated(value = EnumType.STRING)
    private SituacaoMorador situacaoMorador;

    @OneToOne
    private Reuniao reuniao;
}