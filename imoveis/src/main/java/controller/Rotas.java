package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import model.Imovel;

@RestController
public class Rotas {

    @Autowired
    private Gerente gerente;

    @PostMapping("/cadastrar")
    public ResponseEntity<Void> cadastrar(@RequestBody Imovel imovel) {
        gerente.cadastro(imovel);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/listar")
    public String listar() {
        return gerente.listar();
    }

    @GetMapping("/consultar/{matricula}")
    public ResponseEntity<String> consultar(@PathVariable Integer matricula) {
        String imovelEncontrado = gerente.consulta(matricula);
        if (imovelEncontrado != null) {
            return ResponseEntity.ok(imovelEncontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/remover/{matricula}")
    public ResponseEntity<Void> remover(@PathVariable Integer matricula) {
        gerente.remove(matricula);
        return ResponseEntity.ok().build();
    }
}
