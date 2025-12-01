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
    
    private String edicao;
    private String chaveAtivacao;

    public JogoDigital(String nome, double preco, String plataforma,String edicao) {
        super(nome, preco, plataforma);
        this.edicao = edicao;
        this.chaveAtivacao = UUID.randomUUID().toString().substring(0, 12).toUpperCase();//para gera um chave aleatoria 
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    

    
    
    
    
}
