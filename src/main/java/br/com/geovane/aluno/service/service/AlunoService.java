package br.com.geovane.aluno.service.service;

import br.com.geovane.aluno.service.entity.Aluno;
import br.com.geovane.aluno.service.exception.AlunoJaCadastradoException;
import br.com.geovane.aluno.service.message.AlunoCadastrado;
import br.com.geovane.aluno.service.message.PublicaMensagemAlunoCadastrado;
import br.com.geovane.aluno.service.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public record AlunoService(AlunoRepository alunoRepository,
                           PublicaMensagemAlunoCadastrado publicaMensagemAlunoCadastrado) {

    public Aluno salvar(Aluno aluno) {
        boolean alunoJaExiste = alunoRepository.existsByEmail(aluno.getEmail());

        if (alunoJaExiste) {
            throw new AlunoJaCadastradoException("Já existe um aluno com esse email: " + aluno.getEmail());
        }

        aluno = alunoRepository.save(aluno);

        var alunoCadastrado = new AlunoCadastrado(aluno.getId(), aluno.getEmail());
        publicaMensagemAlunoCadastrado.publica(alunoCadastrado);

        return aluno;
    }
}
