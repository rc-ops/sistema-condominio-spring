package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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
    private LocalDate data;

    @Column(name = "finalidade_reuniao", nullable = false, length = 150)
    private String finalidade;
}
