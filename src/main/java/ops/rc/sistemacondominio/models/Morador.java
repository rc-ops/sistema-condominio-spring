package ops.rc.sistemacondominio.models;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "moradores")
public class Morador implements Serializable {
    @Id
    @Column(nullable = false, length = 11)
    @CPF(message = "CPF inválido")
    private String cpf;

    @Column(nullable = false, length = 50)
    @NotEmpty(message = "Nome do morador é obrigatório")
    @Size(min = 3, max = 50, message = "O nome do morador deve conter entre 3 e 50 caracteres")
    private String nome;

    @Column(nullable = false, length = 50)
    @NotEmpty(message = "Sobrenome do morador é obrigatório")
    @Size(min = 3, max = 50, message = "O sobrenome do morador deve conter entre 3 e 50 caracteres")
    private String sobrenome;

    @Column(name = "telefones", length = 50)
    @Size(max = 50, message = "O campo para telefone não pode extrapolar 50 caracteres")
    private String telefones;

    @Email(message = "Email inválido")
    @Size(max = 50, message = "O campo email não pode extrapolar 50 caracteres")
    @Column(name = "emails", length = 50)
    private String emails;

    @Size(min = 3, max = 3, message = "O número do apartamento consiste de 3 dígitos")
    @NotEmpty(message = "O apartamento do morador é obrigatório")
    @Column(nullable = false)
    private int apartamento;

    @Column(name = "observacoes", length = 200)
    @Size(max = 200, message = "O campo observações não pode extrapolar 200 caracteres")
    private String observacoes;

    @Size(max = 200, message = "O campo pendências não pode extrapolar 200 caracteres")
    @Column(name = "pendencias", length = 200)
    private String pendencias;

    @Column(nullable = false, name = "situacao_morador", length = 11)
    @Enumerated(value = EnumType.STRING)
    private SituacaoMorador situacaoMorador;
}