package ops.rc.sistemacondominio.services;

import ops.rc.sistemacondominio.models.Reuniao;
import ops.rc.sistemacondominio.repositories.ReuniaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReuniaoService {
    @Autowired
    ReuniaoRepository repository;

    public Reuniao novaReuniao(Reuniao reuniao) {
        return repository.save(reuniao);
    }

    public List<Reuniao> novasReunioes(List<Reuniao> reunioes) {
        return repository.saveAll(reunioes);
    }

    public Reuniao pesquisaReuniao(int codigo) {
        return repository.findById(codigo).orElse(null);
    }

    public List<Reuniao> pesquisaReuniaoFinalidade(String finalidade){
        return repository.findByFinalidadeContainingIgnoreCase(finalidade);
    }
    public List<Reuniao> listaReunioes() {
        return repository.findAll();
    }

    public void deletarReuniao(int codigo) {
        repository.deleteById(codigo);
    }

    public Reuniao atualizaReuniao(int codigo, Reuniao reuniaoAtualizada) {
        Reuniao reuniao = repository.findById(codigo).orElse(null);
        reuniao.setData(reuniaoAtualizada.getData());
        reuniao.setFinalidade(reuniaoAtualizada.getFinalidade());
        return repository.save(reuniao);
    }
}
