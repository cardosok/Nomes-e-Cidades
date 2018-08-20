/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pais;

import java.util.ArrayList;

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
    
    public Boolean consultaPais(ArrayList<Pais> arrayPais, String pais){    
        for(int i = 0; i< arrayPais.size();i++){
            if(pais.equals(arrayPais.get(i).nome)){
                return false;
            }
        }
        return true;
    }
    
    public Boolean validaDDD(ArrayList<Pais> arrayPais, int ddd, String nome){
        for(int i = 0; i< arrayPais.size();i++){
            if(arrayPais.get(i).nome.equals(nome)){
                if(arrayPais.get(i).ddd == ddd){
                    return true;
                }
            }
        }
        return false;
    }
}
