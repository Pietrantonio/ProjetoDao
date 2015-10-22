/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.dao.PessoaDaoArrayList;
import br.edu.utfpr.dao.PessoaDaoDerby;
import br.edu.utfpr.dao.PessoaDaoVetor;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    //psvm tab
    public static void main(String[] args) {
        System.out.println("Vamos adicionar");
        Pessoa joao = new Pessoa("Joao", "Silva", 20);
        Pessoa jose = new Pessoa("Jose", "Henrique", 19);
        Pessoa pedro = new Pessoa("Pedro", "Lima", 25);
        // Dao dao = new PessoaDaoArrayList();
        Dao dao = new PessoaDaoDerby();
//        dao.adicionar(joao);
//        dao.adicionar(jose);
//        dao.adicionar(pedro);
//        
//        dao.listarTudo();
//        
//        System.out.println("\n\n Vamos remover");
//        dao.remover(jose);
//        dao.listarTudo();
        
   
    }
}
