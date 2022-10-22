package ops.rc.sistemacondominio.services;

import ops.rc.sistemacondominio.models.Morador;
import ops.rc.sistemacondominio.repositories.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {
    @Autowired
    private MoradorRepository repository;

    public Morador novoMorador(Morador morador) {
        return repository.save(morador);
    }

    public List<Morador> novosMoradores(List<Morador> moradores) {
        return repository.saveAll(moradores);
    }

    public Morador pesquisaMorador(String cpf) {
        return repository.findById(cpf).orElse(null);
    }

    public List<Morador> listaMoradores() {
        return repository.findAll();
    }

    public Morador pesquisaMoradorNome(String nome) {
        return repository.findByNome(nome);
    }

    public void deletarMorador(String cpf) {
        repository.deleteById(cpf);
    }

    public Morador atualizarMorador(String cpf, Morador moradorAtualizado) {
        Morador morador = repository.findById(cpf).orElse(null);
        morador.setNome(moradorAtualizado.getNome());
        morador.setSobrenome(moradorAtualizado.getSobrenome());
        morador.setCpf(moradorAtualizado.getCpf());
        morador.setObservacoes(moradorAtualizado.getObservacoes());
        morador.setEmails(morador.getEmails());
        morador.setApartamento(morador.getApartamento());
        morador.setPendencias(moradorAtualizado.getPendencias());
        morador.setSituacaoMorador(moradorAtualizado.getSituacaoMorador());
        morador.setTelefones(moradorAtualizado.getTelefones());
        return repository.save(morador);
    }
}
