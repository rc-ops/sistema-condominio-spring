package ops.rc.sistemacondominio.controllers;

import ops.rc.sistemacondominio.models.Morador;
import ops.rc.sistemacondominio.services.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/morador")
public class MoradorController {
    @Autowired
    private MoradorService service;

    @PostMapping("/novo")
    public Morador novoMorador(@RequestBody Morador morador) {
        return service.novoMorador(morador);
    }

    @PostMapping("/novos")
    public List<Morador> novosMoradores(@RequestBody List<Morador> moradores) {
        return service.novosMoradores(moradores);
    }

    @GetMapping("/todos")
    public List<Morador> listaMoradores() {
        return service.listaMoradores();
    }

    @GetMapping("/pesquisa/{cpf}")
    public Morador pesquisaMorador(@PathVariable(name = "cpf") String cpf) {
        return service.pesquisaMorador(cpf);
    }

    @GetMapping("/pesquisa/{nome}")
    public Morador pesquisaMoradorNome(@PathVariable(name = "nome") String nome) {
        return service.pesquisaMoradorNome(nome);
    }

    @DeleteMapping("/deletar/{cpf}")
    public void deletarMorador(@PathVariable(name = "cpf") String cpf) {
        service.deletarMorador(cpf);
    }

    @PutMapping("/atualizar/{cpf}")
    public Morador atualizarMorador(@PathVariable(name = "cpf") String cpf, @RequestBody Morador morador) {
        return service.atualizarMorador(cpf, morador);
    }
}
