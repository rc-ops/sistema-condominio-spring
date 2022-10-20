package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reunioes")
public class Reuniao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "data_reuniao", nullable = false)
    private Date data;

    @Column(name = "finalidade_reuniao", nullable = false)
    private String finalidade;

    @ManyToOne
    @JoinColumn(name = "morador_cpf")
    private Morador morador;
}
