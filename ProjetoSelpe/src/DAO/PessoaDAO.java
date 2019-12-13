/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import projetoselpe.Model.Pessoa;
import java.util.List;

/**
 *
 * @author luiso
 */
public interface PessoaDAO {
    public void addPessoa(Pessoa p); //ok
    
    public Pessoa pesquisaPessoa(String CPF); //ok
    
    public void alteraPessoa(Pessoa p); //ok (rever)
    
    public List<Pessoa> exibirTodos();
    
    public void removePessoa(Pessoa p); //ok
    
    
    
    
}
