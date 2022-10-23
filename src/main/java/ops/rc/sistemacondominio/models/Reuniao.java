package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
    @NotEmpty(message = "É preciso inserir a data da reunião no formato AAAA-MM-DD")
    private LocalDate data;

    @Column(name = "finalidade_reuniao", nullable = false, length = 150)
    @NotEmpty(message = "É preciso inserir a data da reunião")
    @Size(max = 150, message = "A finalidade da reunião não deve ultrapassar 150 caracteres")
    private String finalidade;
}
