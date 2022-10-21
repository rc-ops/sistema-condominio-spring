package ops.rc.sistemacondominio.repositories;

import ops.rc.sistemacondominio.models.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <Morador, String> {
    Morador findByNome(String nome);
}
