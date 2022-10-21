package ops.rc.sistemacondominio.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pendencias")
public class Pendencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Long codigo;

    @Column(nullable = false, name = "data_vencimento")
    private Date vencimento;

    @Column(name = "vezes_cobradas")
    private int vezesCobradas;

    @Column(nullable = false, name = "descricao_pendencia", length = 50)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}