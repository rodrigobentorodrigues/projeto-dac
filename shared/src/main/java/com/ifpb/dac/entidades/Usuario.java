package com.ifpb.dac.entidades;

import com.ifpb.dac.enums.Tipo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rodrigobento
 */
@Entity
@SequenceGenerator(name = "minha_seq_usu",
        sequenceName = "seq_usu",
        initialValue = 106,
        allocationSize = 1)
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(generator = "minha_seq_usu", strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 20)
    private String senha;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private boolean logado;
    
    // Outro metodo de mapeamento n:m
//    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
//    private List<TurmaAluno> turmaAluno;
    
//    @ManyToMany(mappedBy = "usuarios", fetch = FetchType.EAGER, 
//            cascade = CascadeType.REFRESH)
//    private List<Turma> turmas;

    public Usuario() {
//        turmas = new ArrayList<>();
    }

    public Usuario(String nome, String email, String senha, Tipo tipo, boolean logado) {
        this();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.logado = logado;
    }
    
//    public boolean add(Turma t){
//        return turmas.add(t);
//    }
//    
//    public boolean rmv(Turma t){
//        return turmas.remove(t);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }   
    
//    public List<TurmaAluno> getTurmaAluno() {
//        return turmaAluno;
//    }
//
//    public void setTurmaAluno(List<TurmaAluno> turmaAluno) {
//        this.turmaAluno = turmaAluno;
//    }

//    public List<Turma> getTurmas() {
//        return turmas;
//    }
//
//    public void setTurmas(List<Turma> turmas) {
//        this.turmas = turmas;
//    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", tipo=" + tipo + ", logado=" + logado + '}';
    }
    
    
}
