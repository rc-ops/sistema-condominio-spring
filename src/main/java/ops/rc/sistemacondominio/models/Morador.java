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

    @OneToMany(mappedBy = "morador") // Nome do atributo na entidade Email que faz relacionamento com a classe Morador
    private List<Email> emails;

    @ElementCollection
    private List<String> observacoes;

//    @Column(length = 50)
//    private String email;

    @OneToMany(mappedBy = "morador")
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "morador")
    private List<Pendencia> pendencias;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String sobrenome;

    @Column(nullable = false)
    private int apartamento;

    @OneToMany(mappedBy = "morador")
    private List<Pagamento> pagamentos;

    @Column(nullable = false, name = "situacao_morador", length = 11)
    @Enumerated(value = EnumType.STRING)
    private SituacaoMorador situacaoMorador;

    //Todo: aprender sobre @OneToOne
    @ManyToOne
    @JoinColumn(name = "reuniao_codigo")
    private Reuniao reuniao;
}