/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Higor
 */
public class BibliotecaDeJogos {
    
    private static ArrayList<Jogo> biblioteca = new ArrayList<>();
    
    public void atualizarTabela(ArrayList<Jogo> lista, JTable tabela) {// acho q ta erradissimo isso aqui kkkkkkk
    DefaultTableModel model = (DefaultTableModel) tabela.getModel(); 
    model.setRowCount(0); 
    for (Jogo jogo : lista) {
        model.addRow(new Object[]{
            jogo.getNome(),
            jogo.getPreco(),
            jogo.getPlataforma()
        });
    }
}
    
    

    public void adicionarJogo(Jogo jogo) {
        biblioteca.add(jogo);
    }

    public void removerJogo(Jogo jogo) {
        biblioteca.remove(jogo);
    }
    
    public ArrayList<Jogo> getJogos() {
        return biblioteca;
    }
    
}
