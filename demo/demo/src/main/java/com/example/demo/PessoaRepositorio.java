package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
