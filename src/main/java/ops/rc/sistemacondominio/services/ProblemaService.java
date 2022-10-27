package ops.rc.sistemacondominio.services;

import ops.rc.sistemacondominio.models.Problema;
import ops.rc.sistemacondominio.repositories.ProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemaService {
    @Autowired
    private ProblemaRepository repository;

    public Problema novoProblema(Problema problema) {
        return repository.save(problema);
    }

    public List<Problema> listaProblemas() {
        return repository.findAll();
    }

    public List<Problema> novosProblemas(List<Problema> problemas) {
        return repository.saveAll(problemas);
    }

    public Problema pesquisaProblemaId(int codigo) {
        return repository.findById(codigo).orElse(null);
    }

    public List<Problema> pesquisaProblemaNome(String nome){
        return repository.findProblemaByProblemaContainingIgnoreCase(nome);
    }

    public void deletarProblema(int codigo) {
        repository.deleteById(codigo);
    }

    public Problema atualizarProblema(int codigo, Problema problemaAtualizado) {
        Problema problema = repository.findById(codigo).orElse(null);
        problema.setProblema(problemaAtualizado.getProblema());
        problema.setDataInicio(problemaAtualizado.getDataInicio());
        problema.setDataResolucao(problemaAtualizado.getDataResolucao());
        problema.setDescricao(problemaAtualizado.getDescricao());
        problema.setSituacaoProblema(problemaAtualizado.getSituacaoProblema());
        return repository.save(problema);
    }
}
