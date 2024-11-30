package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaControlador {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        Pessoa novaPessoa = pessoaRepository.save(pessoa);
        return ResponseEntity.ok(novaPessoa);
    }

    @GetMapping
    public ResponseEntity<?> listarPessoas() {
        return ResponseEntity.ok(pessoaRepository.findAll());
    }
}
