package ops.rc.sistemacondominio.controllers;

import ops.rc.sistemacondominio.models.Morador;
import ops.rc.sistemacondominio.services.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
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

    @GetMapping("")
    public List<Morador> listaMoradores() {
        return service.listaMoradores();
    }

    @GetMapping("/pesquisa/cpf/{cpf}")
    public Morador pesquisaMoradorCpf(@PathVariable(name = "cpf") String cpf) {
        return service.pesquisaMoradorCpf(cpf);
    }

    @GetMapping("/pesquisa/nome/{nome}")
    public List<Morador> pesquisaMoradorNome(@PathVariable("nome") String nome) {
        return service.pesquisaMoradorNome(nome);
    }

    @GetMapping("/pesquisa/sobrenome/{sobrenome}")
    public List<Morador> pesquisaMoradorSobrenome(@PathVariable("sobrenome") String sobrenome) {
        return service.pesquisaMoradorSobrenome(sobrenome);
    }

    @DeleteMapping("/deletar/{cpf}")
    public void deletarMorador(@PathVariable("cpf") String cpf) {
        service.deletarMorador(cpf);
    }

    @PutMapping("/atualizar/{cpf}")
    public Morador atualizarMorador(@PathVariable("cpf") String cpf, @RequestBody Morador morador) {
        return service.atualizarMorador(cpf, morador);
    }
}
