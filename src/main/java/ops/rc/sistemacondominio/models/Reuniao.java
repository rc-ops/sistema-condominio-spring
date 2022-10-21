package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reunioes")
public class Reuniao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_reuniao", updatable = false)
    private int codigo;

    @Column(name = "data_reuniao", nullable = false)
    private Date data;

    @Column(name = "finalidade_reuniao", nullable = false, length = 50)
    private String finalidade;

    @OneToMany(mappedBy = "reuniao")
    private List<Morador> morador;
}
