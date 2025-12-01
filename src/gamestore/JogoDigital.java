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
    
    private String edicao;

    public JogoDigital(String nome, double preco, String plataforma,String edicao) {
        super(nome, preco, plataforma);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    

    
    
    
    
}
