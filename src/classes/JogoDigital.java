/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.UUID;

/**
 *
 * @author Higor
 */
public class JogoDigital extends Jogo {
    
    private String chaveAtivacao;

    public JogoDigital(String nome, double preco, String plataforma) {
        super(nome, preco, plataforma);
        this.chaveAtivacao = UUID.randomUUID().toString().substring(0, 12).toUpperCase();//para gera um chave aleatoria 
    }

    public String getChaveAtivacao() {
        return chaveAtivacao;
    }

    
    
    
    
    

    
    
    
    
}
