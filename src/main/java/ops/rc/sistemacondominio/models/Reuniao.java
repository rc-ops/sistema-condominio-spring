package ops.rc.sistemacondominio.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reuniao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "data_reuniao", nullable = false)
    private Date data;

    @Column(name = "finalidade_reuniao", nullable = false)
    private String finalidade;
}
