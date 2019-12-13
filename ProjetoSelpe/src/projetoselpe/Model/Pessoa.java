/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoselpe.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author luiso
 */
@Entity
@Table(name = "PESSOA")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "CPF")
    private String CPF;
    
    @Column(name = "NOME")
    private String nome;    
    
    @Column(name = "TELEFONE")
    private String telefone;
    
    @JoinColumn(name = "CURSOS", referencedColumnName = "CURSOS") // faz a relação entre pessoa e curso. rever
    @OneToOne
    private Cursos cursos;
    
    /*
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA")
    @OneToOne
    private Cursos matricula;
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    

    public Pessoa(Long id, String nome, String CPF, String telefone, Cursos cursos) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.cursos = cursos;
        
    }
    
    
        
}
