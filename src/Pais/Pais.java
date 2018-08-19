/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pais;

/**
 *
 * @author César
 */
public class Pais {
    String nome;
    String sigla;
    int ddd;

    public Pais(String nome, String sigla, int ddd) {
        this.nome = nome;
        this.sigla = sigla;
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    
}
