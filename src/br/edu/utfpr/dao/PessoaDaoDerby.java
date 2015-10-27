/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao {

    Statement stmt; //sera usado para executar SQL

    //quando eu construir um objeto dessa classe vou conectar no banco
    public PessoaDaoDerby() {
        //lembrem-se de usar suas credenciais
        String username = "eduardo";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";
        //depois disso, posso mandar conectar
        //como a conexão pode falhar, vou proteger o bloco
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            System.out.println("Conexão estabelecida");
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA (NOME, SOBRENOME, IDADE) VALUES (" + "'" + p.getNome() + "', " + "'" + p.getSobrenome() + "', " + p.getIdade() + ")";

        System.out.println(instrucao);
        try {
            stmt.executeUpdate(instrucao);
        } catch (SQLException se) {
            System.out.println("Mensagem :" + se.getMessage());
        }
    }

    @Override
    public void remover(Pessoa p) {
        String instrucao = "DELETE FROM PESSOA WHERE NOME = 'Jose' ";
        System.out.println(instrucao);
        try {
            stmt.executeUpdate(instrucao);
        } catch (SQLException se) {
            System.out.println("Mensagem :" + se.getMessage());
        }
    }

    @Override
    public void listarTudo() {
        String instrucao = "SELECT * FROM PESSOA";
        
        try {
            //vou executar e armazenar o resultado, um select traz resultados que precisam ser armazenadas, vamos usar um resultset para isso
           ResultSet rs = stmt.executeQuery(instrucao);
           //rz armazena os dados
           //o nome usando entre aspas la no final é o mesmo nome do campo la na tabela, ao executar o sql, ele traz os nomes la do banco
           while(rs.next()){
               System.out.println("Nome: " + rs.getString("NOME") + "Sobrenome: " + rs.getString("SOBRENOME") + "idade: " + rs.getString("IDADE"));
        }
        } catch (SQLException se) {
            System.out.println("Mensagem do erro: " + se.getMessage());
        }
    }
}
