package ops.rc.sistemacondominio.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pagamentos")
public class Pagamentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data_pagamento", nullable = false)
    private Date data;

    @Column(name = "descricao_pagamento", length = 50)
    private String descricao;

    @Column(name = "valor_pagamento", nullable = false)
    private double valor;
    @ManyToOne
    @JoinColumn(name = "morador_cpf", nullable = false)
    private Morador morador;
}