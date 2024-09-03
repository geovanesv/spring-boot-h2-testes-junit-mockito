package br.com.geovane.aluno.service.repository;

import br.com.geovane.aluno.service.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    boolean existsByEmail(String email);
}
