package ops.rc.sistemacondominio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "telefones_moradores")
public class Telefone implements Serializable {
    @Id
    private String cpf;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}