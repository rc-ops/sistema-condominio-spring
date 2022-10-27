package ops.rc.sistemacondominio.repositories;

import ops.rc.sistemacondominio.models.Problema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemaRepository extends JpaRepository<Problema, Integer> {
    List<Problema> findProblemaByProblemaContainingIgnoreCase(String problema);
}