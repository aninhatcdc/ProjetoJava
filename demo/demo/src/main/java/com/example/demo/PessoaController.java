package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    // Endpoint para cadastrar uma pessoa
    @PostMapping
    public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa novaPessoa = pessoaRepositorio.save(pessoa);
        return ResponseEntity.ok(novaPessoa);
    }

    // Endpoint para listar todas as pessoas
    @GetMapping
    public ResponseEntity<?> listarPessoas() {
        return ResponseEntity.ok(pessoaRepositorio.findAll());
    }
}
