package ops.rc.sistemacondominio.controllers;

import ops.rc.sistemacondominio.models.Reuniao;
import ops.rc.sistemacondominio.services.ReuniaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reunioes")
public class ReuniaoController {

    ReuniaoService service;

    public ReuniaoController(ReuniaoService service) {
        this.service = service;
    }

    @PostMapping("/nova")
    public Reuniao criarReuniao(@RequestBody Reuniao reuniao) {
        return service.novaReuniao(reuniao);
    }

    @PostMapping("/novas")
    public List<Reuniao> novasReunioes(@RequestBody List<Reuniao> reunioes){
        return service.novasReunioes(reunioes);
    }

    @GetMapping("")
    public List<Reuniao> listaReunioes() {
        return service.listaReunioes();
    }

    @GetMapping("/{codigo}")
    public Reuniao pesquisaReuniao(@PathVariable(name = "codigo") int codigo) {
        return service.pesquisaReuniao(codigo);
    }

    @GetMapping("/pesquisa/{finalidade}")
    public List<Reuniao> pesquisaReuniaoFinalidade(@PathVariable(name = "finalidade") String finalidade){
        return service.pesquisaReuniaoFinalidade(finalidade);
    }

    @DeleteMapping("/deletar/{codigo}")
    public void deletarReuniao(@PathVariable(name = "codigo") int codigo) {
        service.deletarReuniao(codigo);
    }

    @PutMapping("/atualizar/{codigo}")
    public Reuniao atualizaReuniao(@PathVariable(name = "codigo") int codigo, @RequestBody Reuniao reuniao) {
        return service.atualizaReuniao(codigo, reuniao);
    }
}
