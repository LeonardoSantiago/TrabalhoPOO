/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonardo
 */
public class Produto {
    
    private String nome;
    private int quantidade;
    private double valor;
    
    
    public Produto(String Nome,int quantidade,double valor){
        this.nome = Nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
    /**
     * @return the Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * @return the Quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(int Quantidade) {
        this.quantidade = Quantidade;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
}
