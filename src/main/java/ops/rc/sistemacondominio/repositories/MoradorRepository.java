package ops.rc.sistemacondominio.repositories;

import ops.rc.sistemacondominio.models.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoradorRepository extends JpaRepository<Morador, String> {
    List<Morador> findMoradorBySobrenomeContainingIgnoreCase(String sobrenome);

    List<Morador> findMoradorByNomeContainingIgnoreCase(String nome);
}
