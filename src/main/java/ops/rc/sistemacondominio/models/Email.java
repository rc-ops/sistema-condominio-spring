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
@Table(name = "emails_moradores")
public class Email implements Serializable {
    @Id
    @Column(nullable = false)
    private String cpf;

    private String email;

    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}
