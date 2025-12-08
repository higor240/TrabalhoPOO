/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;



/**
 *
 * @author Higor
 */
public class JogoFisico extends Jogo {
    
    private int estoque;

    public JogoFisico(String nome, double preco, String plataforma,String versao, int estoque) {
        super(nome, preco, plataforma,versao);
        this.estoque = estoque;
        
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
    
}
