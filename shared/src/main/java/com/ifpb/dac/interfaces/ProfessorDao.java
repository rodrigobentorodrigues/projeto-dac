
package com.ifpb.dac.interfaces;

import com.ifpb.dac.entidades.Professor;
import java.util.List;

public interface ProfessorDao {
    
    void adicionar(Professor prof);
    void remover(Professor prof);
    void atualizar(Professor prof);
    List<Professor> listarTodos();
    Professor buscarPorId(int id);
    List<String> listarNomeProfessores();
    Professor buscarPorNome(String nomeProfessor);
    Professor autentica(String email, String senha);
    boolean verificarEmail(String email);
}
