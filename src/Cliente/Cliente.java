/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.util.ArrayList;

/**
 *
 * @author César
 */
public class Cliente {
 String nome;
 String telefone;
 float limiteCredito;
 int idade;
 String paisNome;
 String paisSigla;

    public Cliente(String nome, String telefone, float limiteCredito, String paisNome, String paisSigla) {
        this.nome = nome;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
        this.paisNome = paisNome;
        this.paisSigla = paisSigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        this.paisNome = paisNome;
    }

    public String getPaisSigla() {
        return paisSigla;
    }

    public void setPaisSigla(String paisSigla) {
        this.paisSigla = paisSigla;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public Boolean consultaNome(ArrayList<String> arrayNome, String nome){
        
        for(int i = 0; i< arrayNome.size();i++){
            if(nome.equals(arrayNome.get(i))){
                return false;
            }
        }
        return true;
    }
}
