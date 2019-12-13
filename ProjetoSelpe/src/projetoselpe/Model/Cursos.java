/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoselpe.Model;

import javax.persistence.Entity;
import javax.persistence.Column;
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
@Table(name = "CURSOS")
public class Cursos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String matricula;
    
    @Column(name = "CURSO")
    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Cursos(String matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    
}
