/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.*;
import projetoselpe.Model.Cursos;
import org.json.JSONObject;

/**
 *
 * @author luiso
 */
public abstract class CursoExecucaoDAO implements CursoDAO{
    private EntityManager entityManager;
    Cursos curso;
    EntityTransaction transac = new EntityTransaction() {

        @Override
        public void begin() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void commit() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void rollback() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setRollbackOnly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getRollbackOnly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isActive() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    public CursoExecucaoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void addCurso(Cursos cur){
        EntityTransaction transac;                
        transac = entityManager.getTransaction();
        transac.begin();
        curso = entityManager.merge(cur); // rever aqui
        curso.setMatricula(curso.getMatricula());
        System.out.println("Curso inserido");
        transac.commit();
    }
    
    public void removeCurso(Cursos cur){
        EntityTransaction transac;
        //rollback se necessario
        
    }
    
    public void alteraCurso(Cursos cur){
        //rollback se necessario
        
    }
    
    public Cursos pesquisaCurso(String matricula){
        return entityManager.find(Cursos.class, matricula);
    }
}
