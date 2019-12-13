/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import projetoselpe.Model.Pessoa;

/**
 *
 * @author luiso
 */
public abstract class PessoaExecucaoDAO implements PessoaDAO{
    private EntityManager entityManager;
    Pessoa p;
    EntityTransaction entityTransaction = new EntityTransaction() {

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

    public PessoaExecucaoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void addPessoa(Pessoa pessoa){
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        p = entityManager.merge(pessoa);
        p.setCPF(pessoa.getCPF());
        System.out.println("Pessoa inserida"); //mudar
        entityTransaction.commit();
    }
    
    public void alteraPessoa(Pessoa pessoa){ //rever aqui
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Só é possível alterar número de telefone"); // alterar depois
        System.out.println("Deseja realmente continuar? 1-S/2-N");
        int op = scanner.nextInt();
        if(op == 1){
            //faz a alteração
            System.out.println("Digite novo telefone:");
            String newTel = scanner.nextLine();
            pessoa.setTelefone(newTel);
            System.out.println("Número da pessoa alterado");
            entityTransaction.commit();
        }
        else{
            return;
        }
    }
    
    public void removePessoa(Pessoa pessoa){ //rever aqui
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        p = entityManager.merge(pessoa);
        p.setCPF(pessoa.getCPF());
        System.out.println("Pessoa removida");
        entityTransaction.commit();
    }
    
    public Pessoa pesquisaPessoa(String CPF){
        return entityManager.find(Pessoa.class, CPF);
    }
    
    
}
