package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "telefones_moradores")
public class Telefone implements Serializable {
    @Id
    @Column(length = 11)
    private String cpf;
    @Column(length = 11)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}