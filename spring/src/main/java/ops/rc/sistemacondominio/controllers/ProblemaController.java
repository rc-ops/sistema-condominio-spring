package ops.rc.sistemacondominio.controllers;

import ops.rc.sistemacondominio.models.Problema;
import ops.rc.sistemacondominio.services.ProblemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problemas")
public class ProblemaController {
    private ProblemaService service;

    public ProblemaController(ProblemaService service) {
        this.service = service;
    }

    @PostMapping("/novo")
    public Problema novoProblema(@RequestBody Problema problema) {
        return service.novoProblema(problema);
    }

    @PostMapping("/novos")
    public List<Problema> novosProblema(@RequestBody List<Problema> problemas) {
        return service.novosProblemas(problemas);
    }

    @GetMapping("")
    public List<Problema> listaProblemas() {
        return service.listaProblemas();
    }

    @GetMapping("/pesquisa/codigo/{codigo}")
    public Problema pesquisaProblemaId(@PathVariable int codigo) {
        return service.pesquisaProblemaId(codigo);
    }

    @GetMapping("/pesquisa/nome/{nome}")
    public List<Problema> pesquisaProblemaNome(@PathVariable String nome) {
        return service.pesquisaProblemaNome(nome);
    }

    @DeleteMapping("/deletar/{codigo}")
    public void deletarProblema(@PathVariable int codigo) {
        service.deletarProblema(codigo);
    }

    @PutMapping("/atualizar/{codigo}")
    public Problema atualizarProblema(@PathVariable int codigo, @RequestBody Problema problema) {
        return service.atualizarProblema(codigo, problema);
    }
}
