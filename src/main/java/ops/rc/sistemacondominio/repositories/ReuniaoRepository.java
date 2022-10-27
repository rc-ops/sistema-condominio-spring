package ops.rc.sistemacondominio.repositories;

import ops.rc.sistemacondominio.models.Reuniao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReuniaoRepository extends JpaRepository<Reuniao, Integer> {

    List<Reuniao> findByFinalidadeContainingIgnoreCase(String finalidade);
}