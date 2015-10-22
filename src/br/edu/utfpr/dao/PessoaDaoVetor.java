/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao{
    private Pessoa lista[];
    private int posicao;
    
    public PessoaDaoVetor(int x){
        lista = new Pessoa[x];
        posicao = 0;
    }

    @Override
    public void adicionar(Pessoa p) {
     lista[posicao] = p;
        System.out.println("A pessoa \"" + p.getNome() + "\" foi adicionada");
        posicao++;
       }
           
    

    @Override
    public void remover(Pessoa p) {
        System.out.println("A pessoa \"" + p.getNome() + "\" foi removida");
        posicao--;
    }

    @Override
    public void listarTudo() {
        //System.out.println("Aqui voce vai listar tudo");
        //for (Pessoa elementoDaLista : lista) {
          //  System.out.println(elementoDaLista);
    }
}

