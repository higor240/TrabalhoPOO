/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamestore;

/**
 *
 * @author Higor
 */
public class JogoDigital extends Jogo {

    public JogoDigital(String nome, double preco, String plataforma) {
        super(nome, preco, plataforma);
        
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String getPlataforma() {
        return plataforma;
    }

    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
}
