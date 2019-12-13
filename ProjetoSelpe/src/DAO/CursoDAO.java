/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import projetoselpe.Model.Cursos;

/**
 *
 * @author luiso
 */
public interface CursoDAO {
    public void addCurso(Cursos c);
    
    public Cursos pesquisaCurso(String matricula);
    
    public void alteraCurso(Cursos c);
    
    public List<Cursos> exibirTodos();
    
    public void removeCurso(Cursos c);
    
    
}
