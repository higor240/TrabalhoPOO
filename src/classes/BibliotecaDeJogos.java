/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Higor
 */
public class BibliotecaDeJogos {
    
    private ArrayList<Jogo> BibliotecaJogos = new ArrayList<>();

    public void adicionarJogo(Jogo jogo) {
        BibliotecaJogos.add(jogo);
    }

    public void removerJogo(Jogo jogo) {
        BibliotecaJogos.remove(jogo);
    }
    
    public ArrayList<Jogo> getJogos() {
        return BibliotecaJogos;
    }
    
}
