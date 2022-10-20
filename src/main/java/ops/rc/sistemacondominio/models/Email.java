package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emails_moradores")
public class Email implements Serializable {
    @Id
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(length = 50)
    private String email;

    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}
