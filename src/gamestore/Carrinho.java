/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamestore;

/**
 *
 * @author Higor
 */
import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Jogo> itens = new ArrayList<>();

    public void adicionar(Jogo jogo) {
        itens.add(jogo);
    }

    public void remover(Jogo jogo) {
        itens.remove(jogo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Jogo jogo : itens) {
            total += jogo.getPreco();
        }
        return total;
    }

    public void limpar() {
        itens.clear();
    }
}
