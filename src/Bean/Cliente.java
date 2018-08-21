/*
Cada cliente deverá ter um nome, um telefone, um limite de crédito, e um país;
Um país deverá ter nome e sigla;
Não é permitido mais de um cliente com o mesmo nome;
Não é permitido mais de um país com o mesmo nome;
O telefone precisa ser validado de acordo com o país;
O limite de crédito é dado automaticamente de acordo com a idade: Para clientes até 18 anos o limite é R$ 100,00. Entre 18 e 35 é R$ 300,00. Acima de 35 é R$ 500,00;
Se o cliente morar no Brasil, ele terá um crédito adicional de R$ 100,00, independente da idade;
Cada país deverá ser identificado pelo nome e abreviação;
O nome do cliente não pode ser menor que 5 caracteres, e o campo país não pode ser nulo/vazio;
Deve ser possível incluir um país antes, durante ou depois de criar um cliente;
Os dados devem ser armazenados em memória RAM por meio de estruturas de dados (arrays, listas, conjuntos);
Deve haver uma interface gráfica para interação com usuário (GUI)
 */
package Bean;

/**
 *
 * @author Tamires
 */
public class Cliente {
    String nome, telefone;
    float limiteDeCredito;
    Pais pais;
    int idade;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public float getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(float limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

}
